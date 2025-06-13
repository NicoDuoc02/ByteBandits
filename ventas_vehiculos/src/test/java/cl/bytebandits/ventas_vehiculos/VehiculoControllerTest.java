package cl.bytebandits.ventas_vehiculos;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.model.EstadoVehiculo;
import cl.bytebandits.ventas_vehiculos.model.Modelo;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;
import cl.bytebandits.ventas_vehiculos.repository.IColorRepository;
import cl.bytebandits.ventas_vehiculos.repository.IEstadoVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IModeloRepository;
import cl.bytebandits.ventas_vehiculos.repository.IVehiculoRepository;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class VehiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private IVehiculoRepository vehiculoRepository;
    @Autowired
    private IModeloRepository modeloRepository;
    @Autowired
    private IColorRepository colorRepository;
    @Autowired
    private IEstadoVehiculoRepository estadoVehiculoRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        vehiculoRepository.deleteAll();

        // Crea un modelo con id 1 si no existe
        Modelo modelo = modeloRepository.findById("M001").orElseGet(() -> {
            Modelo m = new Modelo();
            m.setId("M001");             // Asegúrate que tu Modelo tenga setId(Integer)
            m.setNombreModelo("Corolla");
            return modeloRepository.save(m);
        });

        // Crea color con id 1 si no existe
        Color color = colorRepository.findById(1).orElseGet(() -> {
            Color c = new Color();
            c.setId(1);             // setId(Integer)
            c.setNombreColor("Rojo");
            return colorRepository.save(c);
        });

        // Crea estado con id 1 si no existe
        EstadoVehiculo estado = estadoVehiculoRepository.findById(1).orElseGet(() -> {
            EstadoVehiculo e = new EstadoVehiculo();
            e.setId(1);             // setId(Integer)
            e.setNombreEstado("Disponible");
            return estadoVehiculoRepository.save(e);
        });

        // Vehículo 1
        Vehiculo v1 = new Vehiculo();
        v1.setPatente("ABC123");
        v1.setModelo(modelo);
        v1.setColor(color);
        v1.setAnio(new Date());
        v1.setFechaIngreso(new Date());
        v1.setPrecio(9000000.0);
        v1.setEstadoVehiculo(estado);
        vehiculoRepository.save(v1);

        // Vehículo 2
        Vehiculo v2 = new Vehiculo();
        v2.setPatente("XYZ789");
        v2.setModelo(modelo);
        v2.setColor(color);
        v2.setAnio(new Date());
        v2.setFechaIngreso(new Date());
        v2.setPrecio(10500000.0);
        v2.setEstadoVehiculo(estado);
        vehiculoRepository.save(v2);
    }

    @Test
    void testGetAllVehiculosSuccess() throws Exception {
        mockMvc.perform(get("/api/crud/vehiculos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].patente").exists())
                .andExpect(jsonPath("$[0].modelo.nombreModelo").exists())
                .andExpect(jsonPath("$[0].color.nombreColor").exists())
                .andExpect(jsonPath("$[1].patente").exists())
                .andExpect(jsonPath("$[1].estadoVehiculo.nombreEstado").exists());
    }

    @Test
    void testGetVehiculoByPatenteSuccess() throws Exception {
        mockMvc.perform(get("/api/crud/vehiculos/ABC123"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.patente").value("ABC123"));
    }

    @Test
    void testGetVehiculoByPatenteNotFound() throws Exception {
        mockMvc.perform(get("/api/crud/vehiculos/NOEXISTE"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testCreateVehiculoSuccess() throws Exception {
        String nuevoVehiculoJson = """
                    {
                        "patente": "NEW456",
                        "anio": "2021-05-20T00:00:00.000+00:00",
                        "precio": 15000000,
                        "fechaIngreso": "2025-06-01T00:00:00.000+00:00",
                        "modelo": { "id": 1 },
                        "color": { "id": 1 },
                        "estadoVehiculo": { "id": 1 }
                    }
                """;

        mockMvc.perform(post("/api/crud/vehiculos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(nuevoVehiculoJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.patente").value("NEW456"))
                .andExpect(jsonPath("$.precio").value(15000000))
                .andExpect(jsonPath("$.modelo.id").value(1))
                .andExpect(jsonPath("$.color.id").value(1))
                .andExpect(jsonPath("$.estadoVehiculo.id").value(1));
    }

    @Test
    void testUpdateVehiculoSuccess() throws Exception {
        String updatedJson = """
                    {
                        "patente": "ABC123",
                        "anio": "2020-01-01T00:00:00.000+00:00",
                        "precio": 12000000,
                        "fechaIngreso": "2024-01-01T00:00:00.000+00:00",
                        "modelo": { "id": 1 },
                        "color": { "id": 1 },
                        "estadoVehiculo": { "id": 1 }
                    }
                """;

        mockMvc.perform(put("/api/crud/vehiculos/ABC123")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding(StandardCharsets.UTF_8)
                .content(updatedJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.precio").value(12000000));
    }

    @Test
    void testUpdateVehiculoNotFound() throws Exception {
        String json = """
                    {
                        "patente": "NOEXISTE",
                        "anio": "2020-01-01T00:00:00.000+00:00",
                        "precio": 13000000,
                        "fechaIngreso": "2024-01-01T00:00:00.000+00:00",
                        "modelo": { "id": 1 },
                        "color": { "id": 1 },
                        "estadoVehiculo": { "id": 1 }
                    }
                """;

        mockMvc.perform(put("/api/crud/vehiculos/NOEXISTE")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isNotFound());
    }

    @Test
    void testDeleteVehiculoSuccess() throws Exception {
        mockMvc.perform(delete("/api/crud/vehiculos/XYZ789"))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteVehiculoNotFound() throws Exception {
        mockMvc.perform(delete("/api/crud/vehiculos/NOEXISTE"))
                .andExpect(status().isNotFound());
    }
}

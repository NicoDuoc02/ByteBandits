package cl.bytebandits.ventas_vehiculos;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class VentasVehiculosApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	void setup() {
		// Verificamos que MockMvc esté bien inyectado
		assertNotNull(mockMvc, "MockMvc debería estar inyectado");

	}

	@Test
	void testGetAllVehiculos() throws Exception {
		mockMvc.perform(get("/api/crud/vehiculos"))
				// Verificamos que la respuesta HTTP sea 200 OK
				.andExpect(status().isOk())
				// Verificamos que el cuerpo de la respuesta sea un array JSON
				.andExpect(jsonPath("$").isArray())
				// Verificamos que el array NO esté vacío
				.andExpect(jsonPath("$.length()").isNotEmpty())
				// Validaciones de que los campos existen en el primer elemento
				.andExpect(jsonPath("$[0].patente").exists())
				.andExpect(jsonPath("$[0].modelo").exists())
				.andExpect(jsonPath("$[0].modelo.nombreModelo").exists())
				.andExpect(jsonPath("$[0].color").exists())
				.andExpect(jsonPath("$[0].color.nombreColor").exists())
				.andExpect(jsonPath("$[0].anio").exists())
				.andExpect(jsonPath("$[0].precio").exists())
				.andExpect(jsonPath("$[0].fechaIngreso").exists())
				.andExpect(jsonPath("$[0].estadoVehiculo").exists())
				.andExpect(jsonPath("$[0].estadoVehiculo.nombreEstadoVehiculo").exists())
				.andExpect(jsonPath("$[0].puertas").doesNotExist())
				.andExpect(jsonPath("$[0].patente").value("ABCD12"));
	}

}

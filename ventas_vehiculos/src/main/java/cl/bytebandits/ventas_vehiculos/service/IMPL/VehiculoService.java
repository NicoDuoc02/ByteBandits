package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.exception.VehiculoNotFoundException;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.model.EstadoVehiculo;
import cl.bytebandits.ventas_vehiculos.model.Modelo;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;
import cl.bytebandits.ventas_vehiculos.repository.IVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IColorRepository;
import cl.bytebandits.ventas_vehiculos.repository.IEstadoVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IModeloRepository;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

// implementacion que conecta todos los servicios DTO, Service, Response, Controller, etc (es como un contrato)

@Service

public class VehiculoService implements IVehiculoService {

    @Autowired // inyección SQL
    IVehiculoRepository vehiculoRepository;

    @Autowired
    IColorRepository colorRepository;

    @Autowired
    IModeloRepository modeloRepository;

    @Autowired
    IEstadoVehiculoRepository estadoVehiculoRepository;

    @Autowired
    ModelMapper modelmap;

    @Override
    public List<VehiculoResponse> getAll() {
        List<Vehiculo> lVeh = (List<Vehiculo>) vehiculoRepository.findAll();
        List<VehiculoResponse> lVehRes = new ArrayList<>();

        for (Vehiculo vehiculo : lVeh) {

            VehiculoResponse veh = modelmap.map(vehiculo, VehiculoResponse.class);
            lVehRes.add(veh);
        }

        return lVehRes;

    }

    @Override
    public VehiculoResponse getByPatente(String patente) {
        String patenteFinal = patente.toUpperCase(); // crear variable nueva
        Vehiculo pat = vehiculoRepository.findById(patenteFinal)
                .orElseThrow(() -> new VehiculoNotFoundException("No existe vehículo con patente " + patenteFinal));
        VehiculoResponse patRes = modelmap.map(pat, VehiculoResponse.class);
        return patRes;
    }

    @Override
    public VehiculoResponse grabarVehiculo(VehiculoDTO vehiculoDTO) {
        Vehiculo vehGuardar = modelmap.map(vehiculoDTO, Vehiculo.class);
        vehGuardar.setPatente(vehGuardar.getPatente().toUpperCase());

        Vehiculo guardarVehiculo = vehiculoRepository.save(vehGuardar);

        return modelmap.map(guardarVehiculo, VehiculoResponse.class);
    }

    @Override
    public VehiculoResponse updateVehiculo(String patente, VehiculoDTO vehiculoDTO) {
        String patenteUpper = patente.toUpperCase();
        Vehiculo vehiculo = vehiculoRepository.findById(patenteUpper)
                .orElseThrow(() -> new VehiculoNotFoundException(
                        "Vehículo con patente " + patenteUpper + " no encontrado."));

        // Actualizar relaciones
        Color col = colorRepository.findById(vehiculoDTO.getIdColor())
                .orElseThrow(() -> new VehiculoNotFoundException(
                        "No se encontró el color con ID: " + vehiculoDTO.getIdColor()));
        vehiculo.setColor(col);

        Modelo mod = modeloRepository.findById(vehiculoDTO.getIdModelo())
                .orElseThrow(() -> new VehiculoNotFoundException(
                        "No se encontró el modelo con ID: " + vehiculoDTO.getIdModelo()));
        vehiculo.setModelo(mod);

        EstadoVehiculo est = estadoVehiculoRepository.findById(vehiculoDTO.getIdEstadoVehiculo())
                .orElseThrow(() -> new VehiculoNotFoundException(
                        "No se encontró el estado del vehículo con ID: " + vehiculoDTO.getIdEstadoVehiculo()));
        vehiculo.setEstadoVehiculo(est);

        vehiculo.setAnio(vehiculoDTO.getAnio());
        vehiculo.setPrecio(vehiculoDTO.getPrecio());
        vehiculo.setFechaIngreso(vehiculoDTO.getFechaIngreso());

        vehiculoRepository.save(vehiculo);

        return modelmap.map(vehiculo, VehiculoResponse.class);
    }

    @Override
    public VehiculoResponse deleteVehiculo(String patente) {
        String patenteUpper = patente.toUpperCase();
        Vehiculo vehBorrar = vehiculoRepository.findById(patenteUpper)
                .orElseThrow(() -> new VehiculoNotFoundException(
                        "Vehículo con patente " + patenteUpper + " no encontrado."));

        VehiculoResponse eliminar = modelmap.map(vehBorrar, VehiculoResponse.class);
        vehiculoRepository.deleteById(patenteUpper);
        return eliminar;

    }
}

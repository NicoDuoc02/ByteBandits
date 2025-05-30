package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;

public interface IVehiculoService {

    List<VehiculoResponse> getAll();

    VehiculoResponse getByPatente(String patente);

    VehiculoResponse grabarVehiculo(VehiculoDTO vehiculoDTO);

    VehiculoResponse updateVehiculo(String patente, VehiculoDTO vehiculoDTO);

    VehiculoResponse deteleVehiculo(String patente);    

}

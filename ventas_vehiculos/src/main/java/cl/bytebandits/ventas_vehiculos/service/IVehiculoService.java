package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;

public interface IVehiculoService {

    List<VehiculoResponse> getAll();

    VehiculoResponse getByPatente(String patente);

    

    

}

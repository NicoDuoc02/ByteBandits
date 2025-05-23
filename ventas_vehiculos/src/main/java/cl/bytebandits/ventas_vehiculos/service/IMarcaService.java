package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.response.MarcaResponse;

public interface IMarcaService {

    List<MarcaResponse> getAll();

    MarcaResponse getByIdMarca(Integer idMarca);

}

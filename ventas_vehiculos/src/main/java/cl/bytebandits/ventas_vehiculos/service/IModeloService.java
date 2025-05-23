package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.response.ModeloResponse;

public interface IModeloService {

    List<ModeloResponse> getAll();

    ModeloResponse getByIdModelo(String idModelo);

}

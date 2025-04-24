package cl.bytebandits.ventas_vehiculos.crud.marca.service;

import cl.bytebandits.ventas_vehiculos.crud.marca.model.MarcaModel;

public interface IMarcaService {
    public MarcaModel create(MarcaModel marca);
    public MarcaModel update(MarcaModel marca);
    public void delete(String id_marca);
    public MarcaModel findById(String id_marca);
}

package cl.bytebandits.ventas_vehiculos.crud.modelo.service;

import cl.bytebandits.ventas_vehiculos.crud.modelo.model.ModeloModel;

public interface IModeloService {
    public ModeloModel create(ModeloModel modelo);
    public ModeloModel update(ModeloModel modelo);
    public void delete(String id_modelo);
    public ModeloModel findById(String id_modelo);

}

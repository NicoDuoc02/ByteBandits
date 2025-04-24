package cl.bytebandits.ventas_vehiculos.crud.vehiculo.service;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.model.VehiculoModel;

public interface IVehiculoService {
    public VehiculoModel create(VehiculoModel vehiculo);
    public VehiculoModel update(VehiculoModel vehiculo);
    public void delete(String id);
    public VehiculoModel findById(String id);
    
}
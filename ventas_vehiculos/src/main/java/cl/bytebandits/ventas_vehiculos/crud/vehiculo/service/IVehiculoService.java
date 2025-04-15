package cl.bytebandits.ventas_vehiculos.service;

import cl.bytebandits.ventas_vehiculos.model.VehiculoModel;

public interface IVehiculoService {
    public VehiculoModel create(VehiculoModel vehiculo);
    public VehiculoModel update(VehiculoModel vehiculo);
    public void delete(String id);
    public VehiculoModel findById(String id);
    
}
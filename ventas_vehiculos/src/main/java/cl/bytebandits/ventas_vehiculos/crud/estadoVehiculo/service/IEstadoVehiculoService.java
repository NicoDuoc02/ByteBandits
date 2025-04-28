package cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.service;

import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.model.EstadoVehiculoModel;

public interface IEstadoVehiculoService {
    public EstadoVehiculoModel create(EstadoVehiculoModel estadoVehiculo);
    public EstadoVehiculoModel update(EstadoVehiculoModel estadoVehiculo);
    public void delete(int id_estado_vehiculo);
    public EstadoVehiculoModel findById(int id_estado_vehiculo);
}

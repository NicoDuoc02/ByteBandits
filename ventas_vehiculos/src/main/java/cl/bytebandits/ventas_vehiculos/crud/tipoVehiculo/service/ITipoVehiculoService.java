package cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.service;

import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.model.TipoVehiculoModel;

public interface ITipoVehiculoService {

    public TipoVehiculoModel create(TipoVehiculoModel tipoVehiculo);
    public TipoVehiculoModel update(TipoVehiculoModel tipoVehiculo);
    public void delete(String id_tipo_vehiculo);
    public TipoVehiculoModel findById(String id_tipo_vehiculo);

}

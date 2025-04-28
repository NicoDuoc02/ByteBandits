package cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.model.TipoVehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.repository.TipoVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.service.ITipoVehiculoService;

@Service

public class TipoVehiculoService implements ITipoVehiculoService {
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;
    @Override
    public TipoVehiculoModel create(TipoVehiculoModel tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }
    @Override
    public TipoVehiculoModel update(TipoVehiculoModel tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }
    @Override
    public void delete(String id_tipo_vehiculo) {
        tipoVehiculoRepository.deleteById(id_tipo_vehiculo);
    }
    @Override
    public TipoVehiculoModel findById(String id_tipo_vehiculo) {
        // TODO Auto-generated method stub
        return tipoVehiculoRepository.findById(id_tipo_vehiculo).orElse(null);
    }
    
    
    
    

}

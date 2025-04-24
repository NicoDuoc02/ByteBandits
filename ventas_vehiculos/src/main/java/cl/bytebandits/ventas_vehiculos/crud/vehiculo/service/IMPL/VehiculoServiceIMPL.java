package cl.bytebandits.ventas_vehiculos.crud.vehiculo.service.IMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.vehiculo.model.VehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.repository.IVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.service.IVehiculoService;

@Service
public class VehiculoServiceIMPL implements IVehiculoService{
    
    @Autowired
    private IVehiculoRepository vehiculoRepo;
    
    public VehiculoModel create(VehiculoModel vehiculo) {
        System.out.println("Guardando vehículo: " + vehiculo);
        return vehiculoRepo.save(vehiculo);
    }

    @Override
    public VehiculoModel update(VehiculoModel vehiculo) {
        return vehiculoRepo.save(vehiculo);
         
    }
    @Override
    public void delete(String id) {
        vehiculoRepo.deleteById(id);
        
    }
    @Override
    public VehiculoModel findById(String id) {
        return vehiculoRepo.findById(id).orElse(null);
    }
}

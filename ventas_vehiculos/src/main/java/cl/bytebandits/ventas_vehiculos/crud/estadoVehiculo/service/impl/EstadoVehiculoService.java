package cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.model.EstadoVehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.repository.EstadoVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.service.IEstadoVehiculoService;

@Service

public class EstadoVehiculoService implements IEstadoVehiculoService {
    @Autowired
    private EstadoVehiculoRepository estadoVehiculoRepo;

    @Override
    public EstadoVehiculoModel create(EstadoVehiculoModel estadoVehiculo) {
        return estadoVehiculoRepo.save(estadoVehiculo);
    }

    @Override
    public EstadoVehiculoModel update(EstadoVehiculoModel estadoVehiculo) {
        return estadoVehiculoRepo.save(estadoVehiculo);
    }

    @Override
    public void delete(int id_estado_vehiculo) {
        estadoVehiculoRepo.deleteById(id_estado_vehiculo);
    }

    @Override
    public EstadoVehiculoModel findById(int id_estado_vehiculo) {
        return estadoVehiculoRepo.findById(id_estado_vehiculo).orElse(null);
    }
    // Aquí puedes implementar los métodos de la interfaz IEstadoVehiculoService
    // Por ejemplo, métodos para crear, actualizar, eliminar y buscar estados de vehículos

}

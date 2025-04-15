package cl.bytebandits.ventas_vehiculos.crud.cliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.cliente.model.ClienteModel;
import cl.bytebandits.ventas_vehiculos.crud.cliente.repository.ClienteRepository;
import cl.bytebandits.ventas_vehiculos.crud.cliente.service.IClienteService;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.model.VehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.repository.IVehiculoRepository;

@Service

public class ClienteService implements IClienteService {

    @Autowired
     ClienteRepository clienteRepo;

    @Override
    public ClienteModel create(ClienteModel cliente) {
        System.out.println("Guardando cliente: " + cliente);
        return clienteRepo.save(cliente);
    }

    @Override
    public ClienteModel update(Integer id, ClienteModel cliente) {
        return clienteRepo.save(cliente);
         
    }
    @Override
    public ClienteModel delete(String id) {
        clienteRepo.deleteById(id);
        return null;
        
        
        
    }
    @Override
    public ClienteModel findById(String id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public List<ClienteModel> getall() {
        return (List<ClienteModel>) clienteRepo.findAll();
        // TODO Auto-generated method stub
    }

   
    // Aquí puedes inyectar el repositorio de ClienteModel y otros servicios si es necesario

    // Implementa los métodos de la interfaz IClienteService aquí

}

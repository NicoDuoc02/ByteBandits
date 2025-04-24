package cl.bytebandits.ventas_vehiculos.crud.cliente.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.cliente.model.ClienteModel;
import cl.bytebandits.ventas_vehiculos.crud.cliente.repository.IClienteRepository;
import cl.bytebandits.ventas_vehiculos.crud.cliente.service.IClienteService;
@Service

public class ClienteServiceIMPL implements IClienteService {
    
    @Autowired
    private IClienteRepository clienteRepo;

    public ClienteModel create(ClienteModel cliente) {
        System.out.println("Guardando cliente: " + cliente);
        return clienteRepo.save(cliente);
    }
    @Override
    public ClienteModel update(ClienteModel cliente) {
        return clienteRepo.save(cliente);
    }
    @Override
    public void delete(String id) {
        clienteRepo.deleteById(id);
    }
    @Override
    public ClienteModel findById(String id) {
        return clienteRepo.findById(id).orElse(null);
    }
    
}

package cl.bytebandits.ventas_vehiculos.crud.cliente.service;

import cl.bytebandits.ventas_vehiculos.crud.cliente.model.ClienteModel;

public interface IClienteService {
    public ClienteModel create(ClienteModel cliente);
    public ClienteModel update(ClienteModel cliente);
    public void delete(String rut);
    public ClienteModel findById(String rut);
}

package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.dto.ClienteDTO;
import cl.bytebandits.ventas_vehiculos.response.ClienteResponse;

public interface IClienteService {
  


    List<ClienteResponse> getAll();

    ClienteResponse getByRut(Integer rutCliente);

    ClienteResponse grabarCliente(ClienteDTO clienteDTO);

    ClienteResponse updateCliente(Integer rutCliente, ClienteDTO clienteDTO);

    ClienteResponse deleteCliente(Integer rutCliente);
}




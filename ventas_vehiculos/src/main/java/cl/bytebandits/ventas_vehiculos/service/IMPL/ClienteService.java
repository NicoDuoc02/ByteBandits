

package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.dto.ClienteDTO;
import cl.bytebandits.ventas_vehiculos.model.Cliente;
import cl.bytebandits.ventas_vehiculos.repository.IClienteRepository;
import cl.bytebandits.ventas_vehiculos.response.ClienteResponse;
import cl.bytebandits.ventas_vehiculos.service.IClienteService;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    IClienteRepository clienteRepository;

    @Autowired
    ModelMapper modelmap;

    @Override
    public List<ClienteResponse> getAll() {
        List<Cliente> lCli = (List<Cliente>) clienteRepository.findAll();
        List<ClienteResponse> lCliRes = new ArrayList<>();

        for (Cliente cliente : lCli) {
            ClienteResponse cliRes = modelmap.map(cliente, ClienteResponse.class);

            String nombreCompleto = cliente.getNombreCliente() + " " +
                                    cliente.getApPaterno() + " " +
                                    cliente.getApMaterno();

            cliRes.setNombreCompleto(nombreCompleto);
            lCliRes.add(cliRes);
        }

        return lCliRes;
    }

    @Override
    public ClienteResponse getByRut(Integer rutCliente) {
        Cliente cliente = clienteRepository.findById(rutCliente).get();
        ClienteResponse cliRes = modelmap.map(cliente, ClienteResponse.class);

        String nombreCompleto = cliente.getNombreCliente() + " " +
                                cliente.getApPaterno() + " " +
                                cliente.getApMaterno();

        cliRes.setNombreCompleto(nombreCompleto);
        return cliRes;
    }

    @Override
    public ClienteResponse grabarCliente(ClienteDTO clienteDTO) {
        Cliente cliGuardar = modelmap.map(clienteDTO, Cliente.class);
        Cliente guardarCliente = clienteRepository.save(cliGuardar);

        ClienteResponse cliRes = modelmap.map(guardarCliente, ClienteResponse.class);
        String nombreCompleto = guardarCliente.getNombreCliente() + " " +
                                guardarCliente.getApPaterno() + " " +
                                guardarCliente.getApMaterno();

        cliRes.setNombreCompleto(nombreCompleto);
        return cliRes;
    }

    @Override
    public ClienteResponse updateCliente(Integer rutCliente, ClienteDTO clienteDTO) {
        Cliente cliente = clienteRepository.findById(rutCliente).get();

        cliente.setDvCliente(clienteDTO.getDvCliente());
        cliente.setNombreCliente(clienteDTO.getNombreCliente());
        cliente.setApPaterno(clienteDTO.getApPaterno());
        cliente.setApMaterno(clienteDTO.getApMaterno());
        cliente.setCelular(clienteDTO.getCelular());
        cliente.setEmail(clienteDTO.getEmail());

        clienteRepository.save(cliente);

        ClienteResponse cliRes = modelmap.map(cliente, ClienteResponse.class);
        String nombreCompleto = cliente.getNombreCliente() + " " +
                                cliente.getApPaterno() + " " +
                                cliente.getApMaterno();

        cliRes.setNombreCompleto(nombreCompleto);
        return cliRes;
    }

    @Override
    public ClienteResponse deleteCliente(Integer rutCliente) {
        Cliente cliBorrar = clienteRepository.findById(rutCliente).get();

        ClienteResponse eliminar = modelmap.map(cliBorrar, ClienteResponse.class);
        String nombreCompleto = cliBorrar.getNombreCliente() + " " +
                                cliBorrar.getApPaterno() + " " +
                                cliBorrar.getApMaterno();

        eliminar.setNombreCompleto(nombreCompleto);
        clienteRepository.deleteById(rutCliente);

        return eliminar;
    }
}




package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.bytebandits.ventas_vehiculos.dto.ClienteDTO;
import cl.bytebandits.ventas_vehiculos.response.ClienteResponse;
import cl.bytebandits.ventas_vehiculos.service.IClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @GetMapping
    public List<ClienteResponse> getAllClientes() {
        return clienteService.getAll();
    }

    @GetMapping("/{rut}")
    public ClienteResponse getClienteByRut(@PathVariable("rut") Integer rutCliente) {
        return clienteService.getByRut(rutCliente);
    }

    @PostMapping
    public ClienteResponse guardarCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.grabarCliente(clienteDTO);
    }

    @PutMapping("/{rut}")
    public ClienteResponse actualizarCliente(@PathVariable("rut") Integer rutCliente,
                                             @RequestBody ClienteDTO clienteDTO) {
        return clienteService.updateCliente(rutCliente, clienteDTO);
    }

    @DeleteMapping("/{rut}")
    public ClienteResponse eliminarCliente(@PathVariable("rut") Integer rutCliente) {
        return clienteService.deleteCliente(rutCliente);
    }
}

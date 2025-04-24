package cl.bytebandits.ventas_vehiculos.crud.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.cliente.model.ClienteModel;
import cl.bytebandits.ventas_vehiculos.crud.cliente.service.IClienteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/cliente")

public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    // Crear un cliente
    @PostMapping
    public ClienteModel crearCliente(@RequestBody ClienteModel cliente) {
        return clienteService.create(cliente);
    }

    // Actualizar un cliente
    @PutMapping("/editar/{rut}{dvcliente}")
    public ClienteModel actualizarCliente(@PathVariable String rut, @RequestBody ClienteModel cliente) {
        cliente.getRut_cliente();
        cliente.getDv_cliente(); // Asegurarse de que el RUT del cliente a actualizar sea el correcto
        return clienteService.update(cliente);
    }
    // Eliminar un cliente
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable String id) {
        clienteService.delete(id);
    }

    // Buscar un cliente por ID
    @GetMapping("/buscar/{id}")
    public ClienteModel buscarCliente(@PathVariable String id) {
        return clienteService.findById(id);
    }

}



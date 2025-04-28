package cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.model.EstadoVehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.service.IEstadoVehiculoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/estado_vehiculo")
public class EstadoVehiculoController {
    @Autowired
    private IEstadoVehiculoService estadoVehiculoService;

    @PostMapping
    public EstadoVehiculoModel crearEstadoVehiculo(@RequestBody EstadoVehiculoModel estadoVehiculo) {
        return estadoVehiculoService.create(estadoVehiculo);
    }
    @PutMapping("/editar/{id}")
    public EstadoVehiculoModel actualizarEstadoVehiculo(@PathVariable int id, @RequestBody EstadoVehiculoModel estadoVehiculo) {
        estadoVehiculo.setId_estado_vehiculo(id); 
        return estadoVehiculoService.update(estadoVehiculo);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarEstadoVehiculo(@PathVariable int id) {
        estadoVehiculoService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public EstadoVehiculoModel buscarEstadoVehiculo(@PathVariable int id) {
        return estadoVehiculoService.findById(id);
        }
    

}

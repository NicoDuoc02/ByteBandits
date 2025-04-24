package cl.bytebandits.ventas_vehiculos.crud.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.bytebandits.ventas_vehiculos.crud.vehiculo.model.VehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.vehiculo.service.IVehiculoService;


@RestController
@RequestMapping("api/crud/vehiculo")
public class VehiculoController {
    @Autowired
    private IVehiculoService vehiculoService;

    // Crear un vehículo
    @PostMapping
    public VehiculoModel crearVehiculo(@RequestBody VehiculoModel vehiculo) {
        return vehiculoService.create(vehiculo);
    }

    // Actualizar un vehículo
    @PutMapping("/editar/{id}")
    public VehiculoModel actualizarVehiculo(@PathVariable String id, @RequestBody VehiculoModel vehiculo) {
        vehiculo.setId_Vehiculo(id);
        return vehiculoService.update(vehiculo);
    }

    // Eliminar un vehículo
    @DeleteMapping("/eliminar/{id}")
    public void eliminarVehiculo(@PathVariable String id) {
        vehiculoService.delete(id);
    }

    // Buscar un vehículo por ID
    @GetMapping("/buscar/{id}")
    public VehiculoModel buscarVehiculo(@PathVariable String id) {
        return vehiculoService.findById(id);
    }

}

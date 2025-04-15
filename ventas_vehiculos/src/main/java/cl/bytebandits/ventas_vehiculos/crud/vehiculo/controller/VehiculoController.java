package cl.bytebandits.ventas_vehiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.bytebandits.ventas_vehiculos.model.VehiculoModel;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

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
    @PutMapping("/editar")
    public VehiculoModel actualizarVehiculo(@RequestBody VehiculoModel vehiculo) {
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

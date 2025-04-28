package cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.model.TipoVehiculoModel;
import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.service.ITipoVehiculoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/tipo_vehiculo")

public class TipoVehiculoController {
    private ITipoVehiculoService tipoVehiculoService;

    @PostMapping
    public TipoVehiculoModel crearTipoVehiculo(@RequestBody TipoVehiculoModel tipoVehiculo) {
        return tipoVehiculoService.create(tipoVehiculo);
    }
    @PutMapping("/editar/{id}")
    public TipoVehiculoModel actualizarTipoVehiculo(@PathVariable String id, @RequestBody TipoVehiculoModel tipoVehiculo) {
        tipoVehiculo.setId_tipo_vehiculo(id);
        return tipoVehiculoService.update(tipoVehiculo);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarTipoVehiculo(@PathVariable String id) {
        tipoVehiculoService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public TipoVehiculoModel buscarTipoVehiculo(@PathVariable String id) {
        return tipoVehiculoService.findById(id);
        }

}

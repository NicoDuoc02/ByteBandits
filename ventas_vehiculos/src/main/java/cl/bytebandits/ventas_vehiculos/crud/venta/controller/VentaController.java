package cl.bytebandits.ventas_vehiculos.crud.venta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.venta.model.VentaModel;
import cl.bytebandits.ventas_vehiculos.crud.venta.service.IVentaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/venta")
public class VentaController {
    @Autowired
    private IVentaService ventaService;

    @PostMapping
    public VentaModel crearVenta(@RequestBody VentaModel venta) {
        return ventaService.create(venta);
    }

    @PutMapping("/editar/{id_venta}")
    public VentaModel actualizarVenta(@PathVariable int id_venta, @RequestBody VentaModel venta) {
        venta.setId_venta(id_venta); // Asegurarse de que el ID de la venta a actualizar sea el correcto
        return ventaService.update(venta);
    }
    @DeleteMapping("/eliminar/{id_venta}")
    public void eliminarVenta(@PathVariable int id_venta) {
        ventaService.delete(id_venta);
    }
    @GetMapping("/buscar/{id_venta}")
    public VentaModel buscarVenta(@PathVariable int id_venta) {
        return ventaService.findById(id_venta);
    }

}

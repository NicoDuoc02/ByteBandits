package cl.bytebandits.ventas_vehiculos.crud.vendedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.vendedor.model.VendedorModel;
import cl.bytebandits.ventas_vehiculos.crud.vendedor.service.IVendedorService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/vendedor")
public class VendedorController {
    @Autowired
    private IVendedorService vendedorService;

    @PostMapping
    public VendedorModel crearVendedor(@RequestBody VendedorModel vendedor) {
        return vendedorService.create(vendedor);
    }
    @PutMapping("/editar/{rut}{dv_vendedor}")
    public VendedorModel actualizarVendedor(@PathVariable String rut, @RequestBody VendedorModel vendedor) {
        vendedor.getRut_vendedor();
        vendedor.getDv_vendedor(); // Asegurarse de que el RUT del vendedor a actualizar sea el correcto
        return vendedorService.update(vendedor);
    }

    @DeleteMapping("/eliminar/{rut}{dv_vendedor}")
    public void eliminarVendedor(@PathVariable String rut) {
        vendedorService.delete(rut);
    }
    @GetMapping("/buscar/{rut}{dv_vendedor}")
    public VendedorModel buscarVendedor(@PathVariable String rut) {
        return vendedorService.findById(rut);
    }
}

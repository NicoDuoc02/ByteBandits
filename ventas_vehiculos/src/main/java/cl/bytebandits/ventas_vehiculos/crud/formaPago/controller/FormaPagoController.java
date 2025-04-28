package cl.bytebandits.ventas_vehiculos.crud.formaPago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.formaPago.model.FormaPagoModel;
import cl.bytebandits.ventas_vehiculos.crud.formaPago.service.IFormaPagoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/forma_pago")

public class FormaPagoController {
    @Autowired
    private IFormaPagoService formaPagoService;

    @PostMapping
    public FormaPagoModel crearFormaPago(@RequestBody FormaPagoModel formaPago) {
        return formaPagoService.create(formaPago);
    }
    @PutMapping("/editar/{id}")
    public FormaPagoModel actualizarformaPago(@PathVariable String id, @RequestBody FormaPagoModel formaPago) {
        formaPago.setId_forma_pago(id); 
        return formaPagoService.update(formaPago);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarFormaPago(@PathVariable String id) {
        formaPagoService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public FormaPagoModel buscarFormaPago(@PathVariable String id) {
        return formaPagoService.findById(id);
        }


}

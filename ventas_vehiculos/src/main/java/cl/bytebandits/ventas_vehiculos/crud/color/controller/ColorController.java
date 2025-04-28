package cl.bytebandits.ventas_vehiculos.crud.color.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.color.model.ColorModel;
import cl.bytebandits.ventas_vehiculos.crud.color.service.IColorService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/color")

public class ColorController {
    @Autowired
    private IColorService colorService;

    @PostMapping
    public ColorModel crearColor(@RequestBody ColorModel color) {
        return colorService.create(color);
    }
    @PutMapping("/editar/{id}")
    public ColorModel actualizarColor(@PathVariable int id, @RequestBody ColorModel color) {
        color.setId_color(id); 
        return colorService.update(color);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarColor(@PathVariable int id) {
        colorService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public ColorModel buscarColor(@PathVariable int id) {
        return colorService.findById(id);
        }
    


}

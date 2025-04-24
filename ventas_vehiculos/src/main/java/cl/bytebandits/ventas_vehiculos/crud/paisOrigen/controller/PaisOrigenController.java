package cl.bytebandits.ventas_vehiculos.crud.paisOrigen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.model.PaisOrigenModel;
import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.service.IPaisOrigenService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/pais_origen")
public class PaisOrigenController {
    @Autowired
    private IPaisOrigenService paisOrigenService;

    @PostMapping
    public PaisOrigenModel crearPaisOrigen(@RequestBody PaisOrigenModel paisOrigen) {
        return paisOrigenService.create(paisOrigen);
    }
    @PutMapping("/editar/{id}")
    public PaisOrigenModel actualizarPaisOrigen(@PathVariable int id, @RequestBody PaisOrigenModel paisOrigen) {
        paisOrigen.setId_pais_origen(id); // Asegurarse de que el ID del país de origen a actualizar sea el correcto
        return paisOrigenService.update(paisOrigen);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPaisOrigen(@PathVariable int id) {
        paisOrigenService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public PaisOrigenModel buscarPaisOrigen(@PathVariable int id) {
        return paisOrigenService.findById(id);
        }
}

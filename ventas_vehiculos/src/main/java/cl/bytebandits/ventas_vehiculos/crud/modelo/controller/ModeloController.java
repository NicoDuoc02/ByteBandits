package cl.bytebandits.ventas_vehiculos.crud.modelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.modelo.model.ModeloModel;
import cl.bytebandits.ventas_vehiculos.crud.modelo.service.IModeloService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/crud/modelo")

public class ModeloController {
    @Autowired
    private IModeloService modeloService;

    @PostMapping
    public ModeloModel crearModelo(@RequestBody ModeloModel modelo) {
        return modeloService.create(modelo);
    }
    @PutMapping("/editar/{id}")
    public ModeloModel actualizarModelo(@PathVariable String id, @RequestBody ModeloModel modelo) {
        modelo.setId_modelo(id);
        return modeloService.update(modelo);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarModelo(@PathVariable String id) {
        modeloService.delete(id);
    }
    @GetMapping("/buscar/{id}")
    public ModeloModel buscarModelo(@PathVariable String id) {
        return modeloService.findById(id);
        }

}

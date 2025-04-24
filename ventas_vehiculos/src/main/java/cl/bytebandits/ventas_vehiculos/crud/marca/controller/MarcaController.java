package cl.bytebandits.ventas_vehiculos.crud.marca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.crud.marca.model.MarcaModel;
import cl.bytebandits.ventas_vehiculos.crud.marca.service.IMarcaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/crud/Marca")
public class MarcaController {
    @Autowired
    private IMarcaService MarcaService;

    @PostMapping
    public MarcaModel crearMarca(@RequestBody MarcaModel Marca) {
        return MarcaService.create(Marca);
    }
    @PutMapping("/editar/{id_marca}")
    public MarcaModel actualizarMarca(@PathVariable String id_marca, @RequestBody MarcaModel Marca) {
        Marca.setIdMarca(id_marca); // Asegurarse de que el ID de la marca a actualizar sea el correcto
        return MarcaService.update(Marca);
    }
    @DeleteMapping("/eliminar/{id_marca}")
    public void eliminarMarca(@PathVariable String id_marca) {
        MarcaService.delete(id_marca);
    }
    @GetMapping("/buscar/{id_marca}")
    public MarcaModel buscarMarca(@PathVariable String id_marca) {
        return MarcaService.findById(id_marca);
    }

}

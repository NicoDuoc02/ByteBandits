package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.bytebandits.ventas_vehiculos.response.ModeloResponse;
import cl.bytebandits.ventas_vehiculos.service.IModeloService;

@RestController

@RequestMapping("/api/crud/modelo")

public class ModeloController {
 @Autowired
    IModeloService modeloService;

    @GetMapping
    public List<ModeloResponse> getAll(){
        return modeloService.getAll();
    }

    @GetMapping("/{idModelo}")
    public ModeloResponse getByIdModelo(@PathVariable String idModelo){
        return modeloService.getByIdModelo(idModelo);
    }
}


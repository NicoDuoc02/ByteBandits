package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.bytebandits.ventas_vehiculos.response.MarcaResponse;
import cl.bytebandits.ventas_vehiculos.service.IMarcaService;

@RestController

@RequestMapping("/api/crud/marca")

public class MarcaController {

     @Autowired
    IMarcaService marcaService;

    @GetMapping
    public List<MarcaResponse> getAll(){
        return marcaService.getAll();
    }

    @GetMapping("/{idMarca}")
    public MarcaResponse getByIdMarca(@PathVariable Integer idMarca){
        return marcaService.getByIdMarca(idMarca);
    }
}

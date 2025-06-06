package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.response.BoletaResponse;
import cl.bytebandits.ventas_vehiculos.service.IBoletaService;

@RestController
 @RequestMapping("/api/crud/boleta")
public class BoletaController {

    @Autowired
    IBoletaService boletaService;

    @GetMapping
    public List<BoletaResponse> getAll(){
        return boletaService.getAll();
    }

    @GetMapping("/{numBoleta}")
    public BoletaResponse getByNumBoleta(@PathVariable Integer numBoleta){
        return boletaService.getByNumBoleta(numBoleta);
    }
}




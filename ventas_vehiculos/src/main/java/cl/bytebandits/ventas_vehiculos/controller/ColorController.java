package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.dto.ColorDTO;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.response.ColorResponse;
import cl.bytebandits.ventas_vehiculos.service.IColorService;

@RestController

@RequestMapping("/api/crud/color")

public class ColorController {

     @Autowired
    IColorService colorService;

    @GetMapping
    public List<ColorResponse> getAll(){
        return colorService.getAll();
    }

    @PostMapping
    public Color grabar(@RequestBody ColorDTO color){
        return colorService.grabar(color);
    }
}

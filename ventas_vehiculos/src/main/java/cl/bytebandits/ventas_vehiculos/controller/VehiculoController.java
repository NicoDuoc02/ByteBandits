package cl.bytebandits.ventas_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

@RestController


@RequestMapping("/api/crud/vehiculos")
public class VehiculoController {

    @Autowired
    IVehiculoService vehiculoService;

    @GetMapping
    public List<VehiculoResponse> getAll(){
        return vehiculoService.getAll();
    }

    @GetMapping("/{patente}")
    public VehiculoResponse getByPatente(@PathVariable String patente){
        return vehiculoService.getByPatente(patente);
    }

    @PostMapping // Mapea las solicitudes HTTP POST a este endpoint
    public VehiculoResponse grabarVehiculo(@RequestBody VehiculoDTO vehiculoDTO){
        // Llama al servicio para guardar el vehículo, pasándole el DTO de entrada
        return vehiculoService.grabarVehiculo(vehiculoDTO);
    }

}

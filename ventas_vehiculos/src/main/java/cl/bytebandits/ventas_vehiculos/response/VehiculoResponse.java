package cl.bytebandits.ventas_vehiculos.response;

import java.sql.Date;

import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.model.EstadoVehiculo;
import cl.bytebandits.ventas_vehiculos.model.Modelo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VehiculoResponse {
    private String patente; 
    private Modelo modelo; 
    private Date anio;
    private Color color;  
    private Double precio;
    private Date fechaIngreso;
    private EstadoVehiculo estadoVehiculo; 
}

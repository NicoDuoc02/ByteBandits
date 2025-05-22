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
    // Simplemente los datos que quieres exponer
    private String patente; // Simplemente los datos que quieres exponer
    //private String nombreModelo; 
    //private String nombreMarca;  
    //private Date anio;
    //private String nombreColor;  
    private Double precio;
    //private Date fechaIngreso;
    //private String nombreEstadoVehiculo; 
}

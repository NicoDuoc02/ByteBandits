package cl.bytebandits.ventas_vehiculos.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VehiculoDTO {
    //solo van los ids que queremos guardar, ya que seria muy largo guardar todo
    //esto hace que la bd se encargue de traer lo demas segun la pk (id)
    private String patente; 
    private String idModelo; 
    private Date anio;
    private Integer idColor;  
    private Double precio;
    private Date fechaIngreso;
    private Integer idEstadoVehiculo; 


}

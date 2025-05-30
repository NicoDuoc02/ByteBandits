package cl.bytebandits.ventas_vehiculos.response;

import cl.bytebandits.ventas_vehiculos.model.Marca;
import cl.bytebandits.ventas_vehiculos.model.TipoVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ModeloResponse {
    //private String idModelo;
    private String nombreModelo; 
    private TipoVehiculo tipoVehiculo; 
    private Marca marca;             
}

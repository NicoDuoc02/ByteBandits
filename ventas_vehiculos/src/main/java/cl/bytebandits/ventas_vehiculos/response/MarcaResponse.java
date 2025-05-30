package cl.bytebandits.ventas_vehiculos.response;


import cl.bytebandits.ventas_vehiculos.model.PaisOrigen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MarcaResponse {

    private Integer idMarca;
    private String nombreMarca;
    private PaisOrigen paisOrigen;
}


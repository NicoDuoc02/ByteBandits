package cl.bytebandits.ventas_vehiculos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClienteResponse {
    private Integer rutCliente;
    private String nombreCompleto; 
    private String celular;
    private String email;


}

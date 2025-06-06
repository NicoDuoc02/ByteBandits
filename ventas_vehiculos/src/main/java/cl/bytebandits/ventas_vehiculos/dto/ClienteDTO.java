package cl.bytebandits.ventas_vehiculos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClienteDTO {
    private Integer rutCliente;
    private char dvCliente;
    private String nombreCliente;
    private String apPaterno;
    private String apMaterno;
    private String celular;
    private String email;


}

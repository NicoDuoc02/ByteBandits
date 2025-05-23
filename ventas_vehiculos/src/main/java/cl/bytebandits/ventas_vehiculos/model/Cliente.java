package cl.bytebandits.ventas_vehiculos.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//indica que es una entidad en JPA
@Entity

//indica la tabla en la base de datos
@Table(name="CLIENTE")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="RUT_CLIENTE")
private Integer rutCliente;
@Column(name="DV_CLIENTE")
private char dvCliente;
@Column(name="NOMBRE_CLIENTE")
private String nombreCliente;
@Column(name="APP_PATERNO")
private String apPaterno;
@Column(name="APP_MATERNO")
private String apMaterno;
private String celular;
private String email;

}
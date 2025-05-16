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
@Table(name="MARCA")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Marca {

//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="ID_MARCA")
private Integer idMarca;
@Column(name="NOMBRE_MARCA")
private String nombreMarca;
@Column(name="ID_PAIS_ORIGEN")
private PaisOrigen paisOrigen;

}

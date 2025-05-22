package cl.bytebandits.ventas_vehiculos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//indica que es una entidad en JPA
@Entity

//indica la tabla en la base de datos
@Table(name="MODELO")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Modelo {
//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="ID_MODELO")
private Integer idModelo;
@Column(name="NOMBRE_MODELO")
private String nombreMarca;
//define cómo se mapea la relación entre las entidades 
@ManyToOne //muchos a uno
//permiten que JPA gestione automáticamente la creación de la foreign key en la base de datos
@JoinColumn(name="ID_TIPO_VEHICULO")
private TipoVehiculo tipoVehiculo;

}

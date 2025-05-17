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
@Table(name="TIPO_VEHICULO")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TipoVehiculo {
//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="ID_TIPO_VEHICULO")
private Integer idTipoVehiculo;
@Column(name="NOMBRE_TIPO_VEHICULO")
private String nombreTipoVehiculo;
}

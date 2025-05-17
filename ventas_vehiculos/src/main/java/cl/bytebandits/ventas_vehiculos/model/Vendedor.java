package cl.bytebandits.ventas_vehiculos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
//indica que es una entidad en JPA
@Entity

//indica la tabla en la base de datos
@Table(name="VENDEDOR")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vendedor {
//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="RUT_VENDEDOR")
private Integer rutVendedor;
@Column(name="DV_VENDEDOR")
private char dvVendedor;
@Column(name="NOMBRE_VENDEDOR")
private String nombreVendedor;
@Column(name="APP_PATERNO")
private String apPAterno;
@Column(name="APP_MATERNO")
private String apMAterno;
//@Column(name="CELULAR")
private Integer celular;
//@Column(name="EMAIL")
private String email;


}

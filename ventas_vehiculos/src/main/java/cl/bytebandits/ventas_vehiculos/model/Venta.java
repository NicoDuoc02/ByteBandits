package cl.bytebandits.ventas_vehiculos.model;
/* 
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//indica que es una entidad en JPA
@Entity

//indica la tabla en la base de datos
@Table(name="VENTA")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Venta {

//Especifica que es la PK
@Id
//nombre real de la columna
@Column(name="ID_VENTA")
private Integer idVenta;
@JoinColumn(name="RUT_CLIENTE")
private Cliente cliente;
@JoinColumn(name="RUT_VENDEDOR")
private Vendedor vendedor;
@JoinColumn(name="PATENTE")
private Vehiculo patente;
@Column(name="FECHA_VENTA")
private Date fechaVenta;
@Column(name="PRECIO_VENTA")
private Double precioVenta;
@JoinColumn(name="ID_FORMA_PAGO")
private FormaPago formaPago;

}

*/
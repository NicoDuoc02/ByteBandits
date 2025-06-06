package cl.bytebandits.ventas_vehiculos.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BOLETA")
public class Boleta {
    @Id         
    // Nombre real de la columna 
    @Column(name = "NUMBOLETA")     
    private Integer numboleta;
    @ManyToOne
    @JoinColumn(name = "RUT_CLIENTE")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "RUT_VENDEDOR")
    private Vendedor vendedor;
    
    @ManyToOne(fetch = FetchType.EAGER) 
    @JoinColumn(name = "PATENTE")
    private Vehiculo vehiculo;
    
    @Column(name="FECHA_VENTA")
    private Date fechaVenta;
    @Column(name="PRECIO_VENTA")
    private Double precioVenta;
    @JoinColumn(name="ID_FORMA_PAGO")
    private FormaPago formaPago;

}




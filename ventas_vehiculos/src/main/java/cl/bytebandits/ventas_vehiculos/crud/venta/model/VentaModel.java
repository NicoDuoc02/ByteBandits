package cl.bytebandits.ventas_vehiculos.crud.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="venta")   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VentaModel {
    @Id
    @Column(name = "id_venta")
    private int idVenta;
    private int rutCliente;
    private int rutVendedor;
    private String patente;
    private String fechaenta;
    private int precio_venta;
    private String id_forma_pago;
}


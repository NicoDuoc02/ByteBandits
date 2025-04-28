package cl.bytebandits.ventas_vehiculos.crud.formaPago.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "forma_pago")


public class FormaPagoModel {

            @Id
            @Column(name = "id_forma_pago")
            private String id_forma_pago;
            private String nombre_forma_pago;

}

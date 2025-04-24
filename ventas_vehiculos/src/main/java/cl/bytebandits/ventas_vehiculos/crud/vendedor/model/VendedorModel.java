package cl.bytebandits.ventas_vehiculos.crud.vendedor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="vendedor")   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VendedorModel {
        @Id
        @Column(name = "rut_vendedor")
        private String rut_vendedor;
        private String dv_vendedor;
        private String nombre_vendedor;
        private String app_paterno;
        private String app_materno;
        private int celular;
        private String email;
}

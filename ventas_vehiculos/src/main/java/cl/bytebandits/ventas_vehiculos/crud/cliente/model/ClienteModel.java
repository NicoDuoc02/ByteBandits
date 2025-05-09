package cl.bytebandits.ventas_vehiculos.crud.cliente.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="cliente")   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class ClienteModel {

        @Id
        @Column(name = "rut_cliente")
        private String rut_cliente;
        private String dv_cliente;
        private String nombre_cliente;
        private String app_paterno;
        private String app_materno;
        private String direccion_cliente;
        private String numero_direccion;
        private int id_comuna;
        private int celular;
        private String email;
    
}

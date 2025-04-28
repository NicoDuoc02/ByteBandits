package cl.bytebandits.ventas_vehiculos.crud.modelo.model;

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
@Table(name = "modelo")

public class ModeloModel {
    @Id
    @Column(name = "id_modelo")
    private String id_modelo;
    private String nombre_modelo;
    private String idMarca;
    private String id_tipo_vehiculo;

    


}

package cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.model;

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
@Table(name = "estado_vehiculo")

public class EstadoVehiculoModel {
    @Id
    @Column(name = "id_estado_vehiculo")
    private int id_estado_vehiculo;
    private String nombre_estado_vehiculo;

   
}

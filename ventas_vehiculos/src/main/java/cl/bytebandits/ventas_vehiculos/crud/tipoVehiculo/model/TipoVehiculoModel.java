package cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.model;

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
@Table (name= "tipo_vehiculo")
public class TipoVehiculoModel {
    @Id
    @Column (name = "id_tipo_vehiculo")
    private String id_tipo_vehiculo;
    private String nombre_tipo_vehiculo;
    
    


}

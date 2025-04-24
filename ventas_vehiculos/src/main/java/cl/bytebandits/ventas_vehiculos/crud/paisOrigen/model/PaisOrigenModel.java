package cl.bytebandits.ventas_vehiculos.crud.paisOrigen.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="pais_origen")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaisOrigenModel {
    @Id
    @Column(name = "id_pais_origen")
    private int id_pais_origen;
    private String nombre_pais_origen;
}

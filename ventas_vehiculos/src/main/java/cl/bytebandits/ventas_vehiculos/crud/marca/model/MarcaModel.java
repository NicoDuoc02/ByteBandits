package cl.bytebandits.ventas_vehiculos.crud.marca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="marca")   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MarcaModel {
   @Id
    @Column(name="ID_MARCA")
    private String idMarca;
    private String nombreMarca;
    private int idPaisOrigen;
}

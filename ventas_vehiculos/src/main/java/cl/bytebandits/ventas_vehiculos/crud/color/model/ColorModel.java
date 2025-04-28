package cl.bytebandits.ventas_vehiculos.crud.color.model;

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
@Table(name = "color")

public class ColorModel {
    
    @Id
    @Column(name = "id_color")
    private int id_color;
    private String nombre_color;

    

}

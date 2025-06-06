package cl.bytebandits.ventas_vehiculos.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//indica que es una entidad en JPA
@Entity

// indica la tabla en la base de datos
@Table(name = "VEHICULO")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {
    // Especifica que es la PK
    @Id
    private String patente;
    // JPA intentará cargar la entidad relacionada inmediatamente en el momento en
    // que se carga la entidad principal.
    @ManyToOne(fetch = FetchType.EAGER) // relacion de muchos es a uno
    // permiten que JPA gestione automáticamente la creación de la foreign key en la
    // base de datos
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;
    private Date anio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_COLOR")
    private Color color;
    private Double precio;
    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ESTADO_VEHICULO")
    private EstadoVehiculo estadoVehiculo;

}

package cl.bytebandits.ventas_vehiculos.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="vehiculo")   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VehiculoModel {
    @Id
    @Column(name = "id_vehiculo")
    private String id_Vehiculo;
    private String id_Modelo;
    private Date  anio;
    private String color;
    private int precio_base;
    private Date fecha_ingreso;
    private String id_estado;
    
   
    
}

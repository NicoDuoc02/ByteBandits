package cl.bytebandits.ventas_vehiculos.crud.color.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.color.model.ColorModel;

@Repository

public interface ColorRepository extends JpaRepository<ColorModel, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar colores por nombre o cualquier otro criterio específico

}

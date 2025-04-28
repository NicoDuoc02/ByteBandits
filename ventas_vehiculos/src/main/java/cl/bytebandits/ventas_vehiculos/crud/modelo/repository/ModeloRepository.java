package cl.bytebandits.ventas_vehiculos.crud.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.modelo.model.ModeloModel;
@Repository

public interface ModeloRepository extends JpaRepository<ModeloModel, String> {
    // Aquí puedes agregar métodos personalizados si es necesario

}

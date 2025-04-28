package cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.estadoVehiculo.model.EstadoVehiculoModel;

@Repository

public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculoModel, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar estados de vehículos por nombre o cualquier otro criterio específico

}

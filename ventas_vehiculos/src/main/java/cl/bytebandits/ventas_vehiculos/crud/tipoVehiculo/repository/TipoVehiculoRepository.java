package cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.tipoVehiculo.model.TipoVehiculoModel;

@Repository

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculoModel, String> {

    
}
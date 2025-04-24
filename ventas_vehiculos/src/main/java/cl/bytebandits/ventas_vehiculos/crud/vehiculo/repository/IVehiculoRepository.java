package cl.bytebandits.ventas_vehiculos.crud.vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.vehiculo.model.VehiculoModel;

@Repository
public interface IVehiculoRepository  extends JpaRepository<VehiculoModel, String> {
    
    

}

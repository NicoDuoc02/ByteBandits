package cl.bytebandits.ventas_vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.model.VehiculoModel;

@Repository
public interface IVehiculoRepository  extends JpaRepository<VehiculoModel, String> {
    
    

}

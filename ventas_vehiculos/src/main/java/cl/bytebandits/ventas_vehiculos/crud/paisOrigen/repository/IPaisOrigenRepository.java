package cl.bytebandits.ventas_vehiculos.crud.paisOrigen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.model.PaisOrigenModel;

@Repository
public interface IPaisOrigenRepository extends JpaRepository<PaisOrigenModel, Integer> {
    

}

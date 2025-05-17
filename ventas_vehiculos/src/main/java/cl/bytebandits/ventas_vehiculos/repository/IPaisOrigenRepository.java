package cl.bytebandits.ventas_vehiculos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.model.PaisOrigen;

@Repository

public interface IPaisOrigenRepository extends CrudRepository<PaisOrigen,Integer> {

}

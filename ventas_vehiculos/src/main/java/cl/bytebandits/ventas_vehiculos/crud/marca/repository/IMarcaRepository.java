package cl.bytebandits.ventas_vehiculos.crud.marca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.marca.model.MarcaModel;

@Repository
public interface IMarcaRepository extends JpaRepository<MarcaModel, String> {

}

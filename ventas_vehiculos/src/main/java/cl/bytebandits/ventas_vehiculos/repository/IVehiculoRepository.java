package cl.bytebandits.ventas_vehiculos.repository;

import org.springframework.data.repository.CrudRepository;

import cl.bytebandits.ventas_vehiculos.model.Vehiculo;

public interface IVehiculoRepository extends CrudRepository<Vehiculo,String> {

}

//biblioteca que encapsula el codigo, por lo general se comunica con la base de datos
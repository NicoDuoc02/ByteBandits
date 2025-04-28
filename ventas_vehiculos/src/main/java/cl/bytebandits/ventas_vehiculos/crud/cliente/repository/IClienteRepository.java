package cl.bytebandits.ventas_vehiculos.crud.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import cl.bytebandits.ventas_vehiculos.crud.cliente.model.ClienteModel;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteModel, String> {

    


}

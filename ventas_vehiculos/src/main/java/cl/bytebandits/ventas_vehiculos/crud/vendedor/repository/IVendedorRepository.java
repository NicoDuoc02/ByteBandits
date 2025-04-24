package cl.bytebandits.ventas_vehiculos.crud.vendedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.vendedor.model.VendedorModel;
@Repository

public interface IVendedorRepository extends JpaRepository<VendedorModel, String> {
}


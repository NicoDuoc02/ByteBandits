package cl.bytebandits.ventas_vehiculos.crud.formaPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.formaPago.model.FormaPagoModel;

@Repository

public interface FormaPagoRepository extends JpaRepository<FormaPagoModel, String> {
    // Aquí puedes agregar métodos personalizados si es necesario

}

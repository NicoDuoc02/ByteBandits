package cl.bytebandits.ventas_vehiculos.crud.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.ventas_vehiculos.crud.venta.model.VentaModel;

@Repository
public interface IVentaRepositry extends JpaRepository<VentaModel, Integer> {

}

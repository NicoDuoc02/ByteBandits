package cl.bytebandits.venta_autos_web.crud.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;

@Repository
public interface IUsuarioRepository extends JpaRepository<usuarioModel, Long> {
    usuarioModel findByEmail(String email); // Método para buscar por email
}
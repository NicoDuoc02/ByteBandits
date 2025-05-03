package cl.bytebandits.venta_autos_web.crud.usuario.repository;

import org.springframework.stereotype.Repository;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUsuarioRepository extends JpaRepository<usuarioModel, Long> {
    usuarioModel findByEmail(String email);
}

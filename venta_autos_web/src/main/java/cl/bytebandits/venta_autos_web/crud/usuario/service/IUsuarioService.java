package cl.bytebandits.venta_autos_web.crud.usuario.service;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;

public interface IUsuarioService {
    usuarioModel save(usuarioModel usuario);
    usuarioModel findById(Long id);
    usuarioModel findByEmail(String email); // Método para buscar por email
    usuarioModel update(usuarioModel usuario);
    void deleteById(Long id);
}

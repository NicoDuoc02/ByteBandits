package cl.bytebandits.venta_autos_web.crud.usuario.service;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;

public interface IUsuarioService {
    public usuarioModel save(usuarioModel usuarioModel);
    public usuarioModel findById(Long id);
    public usuarioModel findByEmail(String email);
    public usuarioModel update(usuarioModel usuarioModel);
    public void deleteById(Long id);

   
    public boolean verifyPassword(Long id, String password);
}

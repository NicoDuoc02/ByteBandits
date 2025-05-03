package cl.bytebandits.venta_autos_web.crud.usuario.service.IMPL;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;
import cl.bytebandits.venta_autos_web.crud.usuario.repository.IUsuarioRepository;
import cl.bytebandits.venta_autos_web.crud.usuario.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceIMPL implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public usuarioModel save(usuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    @Override
    public usuarioModel findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public usuarioModel findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public usuarioModel update(usuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Implementación del método para verificar la contraseña
    @Override
    public boolean verifyPassword(Long id, String password) {
        usuarioModel usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return false; // Usuario no encontrado
        }
        return usuario.getPassword().equals(password); // Comparar contraseñas
    }
}

package cl.bytebandits.venta_autos_web.crud.usuario.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;
import cl.bytebandits.venta_autos_web.crud.usuario.repository.IUsuarioRepository;
import cl.bytebandits.venta_autos_web.crud.usuario.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public usuarioModel save(usuarioModel usuario) {
        return usuarioRepository.save(usuario);
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
    public usuarioModel update(usuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}

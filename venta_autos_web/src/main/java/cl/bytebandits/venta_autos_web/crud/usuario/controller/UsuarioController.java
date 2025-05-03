package cl.bytebandits.venta_autos_web.crud.usuario.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;
import cl.bytebandits.venta_autos_web.crud.usuario.service.IUsuarioService;
import io.basc.framework.context.ioc.annotation.Autowired;

@RestController
@RequestMapping("/api/curd/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("")
    public usuarioModel save(@RequestBody usuarioModel usuarioModel) {
        return usuarioService.save(usuarioModel);
    }
    @GetMapping("/{id}")
    public usuarioModel findById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }
    @GetMapping("/email/{email}")
    public usuarioModel findByEmail(@PathVariable String email) {
        return usuarioService.findByEmail(email);
    }
    @PutMapping("/{id}")
    public usuarioModel update(@PathVariable Long id, @RequestBody usuarioModel usuarioModel) {
        usuarioModel.setIdUsuario(id);
        return usuarioService.update(usuarioModel);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        usuarioService.deleteById(id);
    }
}

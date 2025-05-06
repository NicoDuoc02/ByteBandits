package cl.bytebandits.venta_autos_web.crud.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.bytebandits.venta_autos_web.crud.usuario.model.usuarioModel;
import cl.bytebandits.venta_autos_web.crud.usuario.service.IUsuarioService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUsuarioService usuarioService;

    // Endpoint para login
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody usuarioModel usuario) {
        usuarioModel existingUser = usuarioService.findByEmail(usuario.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(usuario.getPassword())) {
            return ResponseEntity.ok("Login exitoso");
        }
        return ResponseEntity.status(401).body("Credenciales incorrectas");
    }

    // Endpoint para registro
    @PostMapping("/register")
    public ResponseEntity<usuarioModel> register(@RequestBody usuarioModel usuario) {
        usuarioModel existingUser = usuarioService.findByEmail(usuario.getEmail());
        if (existingUser != null) {
            return ResponseEntity.status(400).body(null); // Usuario ya existe
        }
        usuarioModel newUser = usuarioService.save(usuario);
        return ResponseEntity.ok(newUser);
    }
}
package cl.bytebandits.venta_autos_web.crud.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Retorna la vista index.html
    }

    @GetMapping("/auth/register")
    public String registerPage() {
        return "register"; // Renderiza el archivo register.html
    }
}

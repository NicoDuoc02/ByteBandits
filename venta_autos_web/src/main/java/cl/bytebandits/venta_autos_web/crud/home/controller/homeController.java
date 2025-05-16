package cl.bytebandits.venta_autos_web.crud.home.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class homeController {
    @PostMapping(value="home")
    public String home(){
        return "home form secure endpoint";
    }

}

package cl.bytebandits.ventas_vehiculos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;

@Configuration

public class AppConfig {

@Bean
public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper;
    }

}

package cl.bytebandits.ventas_vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
    org.springframework.ai.vectorstore.oracle.autoconfigure.OracleVectorStoreAutoConfiguration.class
    
})
@ComponentScan(basePackages = {"cl.bytebandits.ventas_vehiculos"})

public class VentasVehiculosApplication {

    public static void main(String[] args) {
        SpringApplication.run(VentasVehiculosApplication.class, args);
    }
}

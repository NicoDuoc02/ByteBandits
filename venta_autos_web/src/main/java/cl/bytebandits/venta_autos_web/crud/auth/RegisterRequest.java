package cl.bytebandits.venta_autos_web.crud.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    
    String  username;     
    String  password;
    String fistname; 
    String lastname;
    String country;

        
}

package cl.bytebandits.ventas_vehiculos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VehiculoNotFoundException.class)
    public ResponseEntity<Object> handleVehiculoNotFoundException(VehiculoNotFoundException ex) {
        return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(VehiculoAlreadyExistsException.class)
    public ResponseEntity<Object> handleVehiculoAlreadyExistsException(VehiculoAlreadyExistsException ex) {
        return buildResponseEntity(HttpStatus.CONFLICT, ex.getMessage());
    }

    @ExceptionHandler(InvalidVehiculoDataException.class)
    public ResponseEntity<Object> handleInvalidVehiculoDataException(InvalidVehiculoDataException ex) {
        return buildResponseEntity(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    // fallback para cualquier otra excepción no controlada
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGeneralException(Exception ex) {
        return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error inesperado.");
    }

    // Método privado para construir una respuesta uniforme
    private ResponseEntity<Object> buildResponseEntity(HttpStatus status, String message) {
        Map<String, Object> errorBody = new HashMap<>();
        errorBody.put("timestamp", LocalDateTime.now());
        errorBody.put("status", status.value());
        errorBody.put("error", status.getReasonPhrase());
        errorBody.put("message", message);

        return new ResponseEntity<>(errorBody, status);
    }
}

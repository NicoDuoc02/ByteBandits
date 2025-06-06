package cl.bytebandits.ventas_vehiculos.exception;

public class VehiculoAlreadyExistsException extends RuntimeException {
    public VehiculoAlreadyExistsException(String message) {
        super(message);
    }
}


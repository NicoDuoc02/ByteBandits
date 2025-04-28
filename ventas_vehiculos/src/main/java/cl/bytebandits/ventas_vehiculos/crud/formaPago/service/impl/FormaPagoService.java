package cl.bytebandits.ventas_vehiculos.crud.formaPago.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.formaPago.model.FormaPagoModel;
import cl.bytebandits.ventas_vehiculos.crud.formaPago.repository.FormaPagoRepository;
import cl.bytebandits.ventas_vehiculos.crud.formaPago.service.IFormaPagoService;

@Service

public class FormaPagoService implements IFormaPagoService {
    @Autowired 
    private FormaPagoRepository formaPagoRepo;

    @Override
    public FormaPagoModel create(FormaPagoModel formaPago) {
        System.out.println("Guardando formaPago: " + formaPago);
        return formaPagoRepo.save(formaPago);
    }

    @Override
    public FormaPagoModel update(FormaPagoModel formaPago) {
        return formaPagoRepo.save(formaPago);
    }

    @Override
    public void delete(String id_forma_pago) {
        formaPagoRepo.deleteById(id_forma_pago);
    }

    @Override
    public FormaPagoModel findById(String id_forma_pago) {
        return formaPagoRepo.findById(id_forma_pago).orElse(null);
    }
    // Aquí puedes implementar los métodos de la interfaz IFormaPagoService según sea necesario

}

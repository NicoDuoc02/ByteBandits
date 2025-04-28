package cl.bytebandits.ventas_vehiculos.crud.formaPago.service;

import cl.bytebandits.ventas_vehiculos.crud.formaPago.model.FormaPagoModel;

public interface IFormaPagoService {
    public FormaPagoModel create(FormaPagoModel formaPago);
    public FormaPagoModel update(FormaPagoModel formaPago);
    public void delete(String id_forma_pago);
    public FormaPagoModel findById(String id_forma_pago);

}

package cl.bytebandits.ventas_vehiculos.crud.venta.service;

import cl.bytebandits.ventas_vehiculos.crud.venta.model.VentaModel;

public interface IVentaService {
    public VentaModel create(VentaModel venta);
    public VentaModel update(VentaModel venta);
    public void delete(int id_venta);
    public VentaModel findById(int id_venta);
}

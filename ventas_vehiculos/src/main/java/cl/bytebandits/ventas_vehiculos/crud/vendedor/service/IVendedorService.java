package cl.bytebandits.ventas_vehiculos.crud.vendedor.service;

import cl.bytebandits.ventas_vehiculos.crud.vendedor.model.VendedorModel;

public interface IVendedorService {
    public VendedorModel create(VendedorModel vendedor);
    public VendedorModel update(VendedorModel vendedor);
    public void delete(String rut_vendedor);
    public VendedorModel findById(String rut_vendedor);
}

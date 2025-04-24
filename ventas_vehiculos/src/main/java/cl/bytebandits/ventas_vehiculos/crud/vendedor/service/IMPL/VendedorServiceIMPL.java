package cl.bytebandits.ventas_vehiculos.crud.vendedor.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;

import cl.bytebandits.ventas_vehiculos.crud.vendedor.model.VendedorModel;
import cl.bytebandits.ventas_vehiculos.crud.vendedor.repository.IVendedorRepository;
import cl.bytebandits.ventas_vehiculos.crud.vendedor.service.IVendedorService;

public class VendedorServiceIMPL implements IVendedorService {
    @Autowired
    private IVendedorRepository vendedorRepository;

    @Override
    public VendedorModel create(VendedorModel vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @Override
    public VendedorModel update(VendedorModel vendedor) {
        return vendedorRepository.save(vendedor);
    }

    @Override
    public void delete(String rut_vendedor) {
        vendedorRepository.deleteById(rut_vendedor);
    }

    @Override
    public VendedorModel findById(String rut_vendedor) {
        return vendedorRepository.findById(rut_vendedor).orElse(null);
    }
}

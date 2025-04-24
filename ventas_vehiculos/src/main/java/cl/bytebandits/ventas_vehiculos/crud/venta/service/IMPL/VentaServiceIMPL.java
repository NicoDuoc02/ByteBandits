package cl.bytebandits.ventas_vehiculos.crud.venta.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;

import cl.bytebandits.ventas_vehiculos.crud.venta.model.VentaModel;
import cl.bytebandits.ventas_vehiculos.crud.venta.repository.IVentaRepositry;
import cl.bytebandits.ventas_vehiculos.crud.venta.service.IVentaService;

public class VentaServiceIMPL implements IVentaService {
    @Autowired
    private IVentaRepositry ventaRepo;

    @Override
    public VentaModel create(VentaModel venta) {
        return ventaRepo.save(venta);
    }

    @Override
    public VentaModel update(VentaModel venta) {
        return ventaRepo.save(venta);
    }

    @Override
    public void delete(int id_venta) {
        ventaRepo.deleteById(id_venta);
    }

    @Override
    public VentaModel findById(int id_venta) {
        return ventaRepo.findById(id_venta).orElse(null);
    }

}

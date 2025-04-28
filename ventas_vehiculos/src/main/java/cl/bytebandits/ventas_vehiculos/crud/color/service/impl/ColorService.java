package cl.bytebandits.ventas_vehiculos.crud.color.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.color.model.ColorModel;
import cl.bytebandits.ventas_vehiculos.crud.color.repository.ColorRepository;
import cl.bytebandits.ventas_vehiculos.crud.color.service.IColorService;

@Service
public class ColorService implements IColorService{
    @Autowired
    private ColorRepository colorRepo;

    @Override
    public ColorModel create(ColorModel color) {
        return colorRepo.save(color);
    }

    @Override
    public ColorModel update(ColorModel color) {
        return colorRepo.save(color);
    }

    @Override
    public void delete(int id_color) {
        colorRepo.deleteById(id_color);
    }

    @Override
    public ColorModel findById(int id_color) {
        return colorRepo.findById(id_color).orElse(null);
    }

}

package cl.bytebandits.ventas_vehiculos.crud.color.service;

import cl.bytebandits.ventas_vehiculos.crud.color.model.ColorModel;

public interface IColorService {
    public ColorModel create(ColorModel color);
    public ColorModel update(ColorModel color);
    public void delete(int id_color);
    public ColorModel findById(int id_color);

}

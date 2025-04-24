package cl.bytebandits.ventas_vehiculos.crud.paisOrigen.service;

import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.model.PaisOrigenModel;

public interface IPaisOrigenService {
    public PaisOrigenModel create(PaisOrigenModel paisOrigen);
    public PaisOrigenModel update(PaisOrigenModel paisOrigen);
    public void delete(int id_pais_origen);
    public PaisOrigenModel findById(int id_pais_origen);
}

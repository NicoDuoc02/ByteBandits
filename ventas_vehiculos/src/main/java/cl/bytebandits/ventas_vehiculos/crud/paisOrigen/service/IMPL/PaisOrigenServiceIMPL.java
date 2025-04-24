package cl.bytebandits.ventas_vehiculos.crud.paisOrigen.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;

import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.model.PaisOrigenModel;
import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.repository.IPaisOrigenRepository;
import cl.bytebandits.ventas_vehiculos.crud.paisOrigen.service.IPaisOrigenService;
import org.springframework.stereotype.Service;
@Service
public class PaisOrigenServiceIMPL implements IPaisOrigenService{
    @Autowired
    private IPaisOrigenRepository paisOrigenRepository;
    @Override
    public PaisOrigenModel create(PaisOrigenModel paisOrigen) {
        return paisOrigenRepository.save(paisOrigen);
    }
    @Override
    public PaisOrigenModel update(PaisOrigenModel paisOrigen) {
        return paisOrigenRepository.save(paisOrigen);
    }
    @Override
    public void delete(int id_pais_origen) {
        paisOrigenRepository.deleteById(id_pais_origen);
    }
    @Override
    public PaisOrigenModel findById(int id_pais_origen) {
        return paisOrigenRepository.findById(id_pais_origen).orElse(null);
    }

}

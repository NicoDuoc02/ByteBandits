package cl.bytebandits.ventas_vehiculos.crud.marca.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;

import cl.bytebandits.ventas_vehiculos.crud.marca.model.MarcaModel;
import cl.bytebandits.ventas_vehiculos.crud.marca.repository.IMarcaRepository;
import cl.bytebandits.ventas_vehiculos.crud.marca.service.IMarcaService;
import org.springframework.stereotype.Service;
@Service
public class MarcaServiceIMPL implements IMarcaService {
    @Autowired
    private IMarcaRepository marcaRepo;

    @Override
    public MarcaModel create(MarcaModel marca) {
        return marcaRepo.save(marca);
    }

    @Override
    public MarcaModel update(MarcaModel marca) {
        return marcaRepo.save(marca);
    }

    @Override
    public void delete(String id_marca) {
        marcaRepo.deleteById(id_marca);
    }

    @Override
    public MarcaModel findById(String id_marca) {
        return marcaRepo.findById(id_marca).orElse(null);
    }

}
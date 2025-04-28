package cl.bytebandits.ventas_vehiculos.crud.modelo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.crud.modelo.model.ModeloModel;
import cl.bytebandits.ventas_vehiculos.crud.modelo.repository.ModeloRepository;
import cl.bytebandits.ventas_vehiculos.crud.modelo.service.IModeloService;

@Service

public class ModeloService implements IModeloService {
    @Autowired
    private ModeloRepository modeloRepo;

    @Override
    public ModeloModel create(ModeloModel modelo) {
        return modeloRepo.save(modelo);
    }

    @Override
    public ModeloModel update(ModeloModel modelo) {
        return modeloRepo.save(modelo);
    }

    @Override
    public void delete(String id_modelo) {
        modeloRepo.deleteById(id_modelo);
    }

    @Override
    public ModeloModel findById(String id_modelo) {
        return modeloRepo.findById(id_modelo).orElse(null);
    }

    

}

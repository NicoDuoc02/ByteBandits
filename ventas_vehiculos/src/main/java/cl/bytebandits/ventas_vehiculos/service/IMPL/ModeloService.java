package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.bytebandits.ventas_vehiculos.model.Modelo;
import cl.bytebandits.ventas_vehiculos.repository.IModeloRepository;
import cl.bytebandits.ventas_vehiculos.response.ModeloResponse;
import cl.bytebandits.ventas_vehiculos.service.IModeloService;

@Service
public class ModeloService implements IModeloService {
     @Autowired
    IModeloRepository modeloRepository;
    
    @Autowired
    ModelMapper modelmap;

    @Override
    public List<ModeloResponse> getAll() {
       List<Modelo> lMod = (List<Modelo>) modeloRepository.findAll();
       List<ModeloResponse> lModRes = new ArrayList<>();

       for (Modelo modelo : lMod){
        
        ModeloResponse mod = modelmap.map(modelo, ModeloResponse.class);
        lModRes.add(mod);
       }

       return lModRes;

   
    }

    @Override
    public ModeloResponse getByIdModelo(String idModelo) {
        idModelo = idModelo.toUpperCase();
        Modelo mod = modeloRepository.findById(idModelo).get();
        ModeloResponse modRes = modelmap.map(mod, ModeloResponse.class);
        return modRes;
    }

}

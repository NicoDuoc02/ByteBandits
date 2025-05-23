package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.bytebandits.ventas_vehiculos.model.Marca;
import cl.bytebandits.ventas_vehiculos.repository.IMarcaRepository;
import cl.bytebandits.ventas_vehiculos.response.MarcaResponse;
import cl.bytebandits.ventas_vehiculos.service.IMarcaService;

@Service
public class MarcaService implements IMarcaService {

     @Autowired
    IMarcaRepository marcaRepository;
    
    @Autowired
    ModelMapper modelmap;

    @Override
    public List<MarcaResponse> getAll() {
       List<Marca> lMar = (List<Marca>) marcaRepository.findAll();
       List<MarcaResponse> lMarRes = new ArrayList<>();

       for (Marca marca : lMar){
        
        MarcaResponse mar = modelmap.map(marca, MarcaResponse.class);
        lMarRes.add(mar);
       }

       return lMarRes;


    }

    @Override
    public MarcaResponse getByIdMarca(Integer idMarca) {
        Marca mar = marcaRepository.findById(idMarca).get();
        MarcaResponse marRes = modelmap.map(mar, MarcaResponse.class);
        return marRes;
    }

    


}

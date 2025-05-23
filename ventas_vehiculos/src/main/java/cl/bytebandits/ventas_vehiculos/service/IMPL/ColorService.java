package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.dto.ColorDTO;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.repository.IColorRepository;
import cl.bytebandits.ventas_vehiculos.response.ColorResponse;
import cl.bytebandits.ventas_vehiculos.service.IColorService;

@Service

public class ColorService implements IColorService {

    @Autowired
    IColorRepository colorRepository;
    
    @Autowired
    ModelMapper modelmap;

     @Override
    public List<ColorResponse> getAll() {
       List<Color> lCol = (List<Color>) colorRepository.findAll();
       List<ColorResponse> lColRes = new ArrayList<>();

       for (Color color : lCol){
        
        ColorResponse col = modelmap.map(color, ColorResponse.class);
        lColRes.add(col);
       }

       return lColRes;


    }

    public Color grabar(ColorDTO color) {
        Color col = modelmap.map(color, Color.class);
        return colorRepository.save(col);
    }

    

}

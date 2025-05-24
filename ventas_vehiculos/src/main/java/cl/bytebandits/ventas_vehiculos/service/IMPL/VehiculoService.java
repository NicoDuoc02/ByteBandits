package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;
import cl.bytebandits.ventas_vehiculos.repository.IVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

@Service

public class VehiculoService implements IVehiculoService{

    @Autowired
    IVehiculoRepository vehiculoRepository;
    
    @Autowired
    ModelMapper modelmap;

    @Override
    public List<VehiculoResponse> getAll() {
       List<Vehiculo> lVeh = (List<Vehiculo>) vehiculoRepository.findAll();
       List<VehiculoResponse> lVehRes = new ArrayList<>();

       for (Vehiculo vehiculo : lVeh){
        
        VehiculoResponse veh = modelmap.map(vehiculo, VehiculoResponse.class);
        lVehRes.add(veh);
       }

       return lVehRes;

    }

    @Override
    public VehiculoResponse getByPatente(String patente) {
        patente = patente.toUpperCase();
        Vehiculo pat = vehiculoRepository.findById(patente).get();
        VehiculoResponse patRes = modelmap.map(pat, VehiculoResponse.class);
        return patRes;
    }

}

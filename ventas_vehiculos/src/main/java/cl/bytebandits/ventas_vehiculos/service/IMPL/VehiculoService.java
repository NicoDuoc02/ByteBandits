package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.dto.ColorDTO;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;
import cl.bytebandits.ventas_vehiculos.repository.IVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IColorRepository;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

@Service

public class VehiculoService implements IVehiculoService{

    @Autowired
    IVehiculoRepository vehiculoRepository;

    @Autowired
    IColorRepository colorRepository;


    
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

    @Override
    public VehiculoResponse grabarVehiculo(VehiculoDTO vehiculoDTO) {
       
        Vehiculo vehGuardar = modelmap.map(vehiculoDTO, Vehiculo.class);
        vehGuardar.setPatente(vehGuardar.getPatente().toUpperCase());

        // Guarda la entidad Vehiculo en la base de datos
        Vehiculo guardarVehiculo = vehiculoRepository.save(vehGuardar);

        // Mapea la entidad guardada a VehiculoResponse para la respuesta de la API
        return modelmap.map(guardarVehiculo, VehiculoResponse.class);
    }
     
    @Override
    public VehiculoResponse updateVehiculo(String patente, VehiculoDTO vehiculoDTO) {
             Vehiculo vehiculo = vehiculoRepository.findById(patente).get();

             // Mapeo seguro (ignora relaciones)
              modelmap.map(vehiculoDTO, vehiculo);

              // Actualizar color MANUALMENTE si está presente en el DTO
              Color nuevoColor = colorRepository.findById(ColorDTO.getIdColor()).get();
              vehiculo.setColor(nuevoColor);
           
            return modelmap.map(vehiculo, VehiculoResponse.class);
    }


}

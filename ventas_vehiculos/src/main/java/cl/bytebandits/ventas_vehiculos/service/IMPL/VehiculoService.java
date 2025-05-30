package cl.bytebandits.ventas_vehiculos.service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bytebandits.ventas_vehiculos.dto.VehiculoDTO;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.model.EstadoVehiculo;
import cl.bytebandits.ventas_vehiculos.model.Modelo;
import cl.bytebandits.ventas_vehiculos.model.Vehiculo;
import cl.bytebandits.ventas_vehiculos.repository.IVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IColorRepository;
import cl.bytebandits.ventas_vehiculos.repository.IEstadoVehiculoRepository;
import cl.bytebandits.ventas_vehiculos.repository.IModeloRepository;
import cl.bytebandits.ventas_vehiculos.response.VehiculoResponse;
import cl.bytebandits.ventas_vehiculos.service.IVehiculoService;

@Service

public class VehiculoService implements IVehiculoService{

    @Autowired
    IVehiculoRepository vehiculoRepository;

    @Autowired
    IColorRepository colorRepository;

    @Autowired
    IModeloRepository modeloRepository;

    @Autowired
    IEstadoVehiculoRepository estadoVehiculoRepository;

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
             patente = patente.toUpperCase();
             Vehiculo vehiculo = vehiculoRepository.findById(patente).get();

              // Actualizar los id de manera manual para que no de error
              Color col = colorRepository.findById(vehiculoDTO.getIdColor()).get();
              vehiculo.setColor(col);

              Modelo mod = modeloRepository.findById(vehiculoDTO.getIdModelo()).get();
              vehiculo.setModelo(mod);

              EstadoVehiculo est = estadoVehiculoRepository.findById(vehiculoDTO.getIdEstadoVehiculo()).get();
              vehiculo.setEstadoVehiculo(est);

              vehiculo.setAnio(vehiculoDTO.getAnio());
              vehiculo.setPrecio(vehiculoDTO.getPrecio());
              vehiculo.setFechaIngreso(vehiculoDTO.getFechaIngreso());

              vehiculoRepository.save(vehiculo);

              return modelmap.map(vehiculo, VehiculoResponse.class);
    }

     @Override
     public VehiculoResponse deleteVehiculo(String patente) {
       patente = patente.toUpperCase(); 

    Vehiculo vehBorrar = vehiculoRepository.findById(patente).get(); 
    
    VehiculoResponse eliminar = modelmap.map(vehBorrar, VehiculoResponse.class);

    vehiculoRepository.deleteById(patente);
    
    return eliminar;
}


}

package cl.bytebandits.ventas_vehiculos.service;

import java.util.List;

import cl.bytebandits.ventas_vehiculos.dto.ColorDTO;
import cl.bytebandits.ventas_vehiculos.model.Color;
import cl.bytebandits.ventas_vehiculos.response.ColorResponse;

public interface IColorService {

    Color grabar(ColorDTO color);

    List<ColorResponse> getAll();
}

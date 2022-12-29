package com.examenfinal.app.domain.cliente.services;

import com.examenfinal.app.domain.cliente.dto.ClienteDTO;
import com.examenfinal.app.domain.cliente.dto.ReporteDTO;

import java.util.List;

public interface ReporteService {

    ReporteDTO registrar(ReporteDTO reporteDTO);

    List<ReporteDTO> listar(ClienteDTO clienteDTO);

}

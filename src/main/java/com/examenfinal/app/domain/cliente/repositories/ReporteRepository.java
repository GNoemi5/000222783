package com.examenfinal.app.domain.cliente.repositories;

import com.examenfinal.app.domain.cliente.entities.Cliente;
import com.examenfinal.app.domain.cliente.entities.Reporte;

import java.util.List;

public interface ReporteRepository {

    Reporte registrar(Reporte reporte);

    List<Reporte> listar(Cliente cliente);

}

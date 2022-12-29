package com.examenfinal.app.infraestructure.cliente;

import com.examenfinal.app.domain.cliente.entities.Cliente;
import com.examenfinal.app.domain.cliente.entities.Reporte;
import com.examenfinal.app.domain.cliente.repositories.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReporteRepositoryImpl implements ReporteRepository {

    @Autowired
    private ReporteJpaRepository reporteJpaRepository;

    @Override
    public Reporte registrar(Reporte reporte) {
        return reporteJpaRepository.save(reporte);
    }

    @Override
    public List<Reporte> listar(Cliente cliente) {
        return reporteJpaRepository.findReportesByCliente(cliente);
    }
}

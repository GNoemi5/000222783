package com.examenfinal.app.infraestructure.cliente;

import com.examenfinal.app.domain.cliente.entities.Cliente;
import com.examenfinal.app.domain.cliente.entities.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReporteJpaRepository extends JpaRepository<Reporte,Integer> {

    List<Reporte> findReportesByCliente(Cliente cliente);

}

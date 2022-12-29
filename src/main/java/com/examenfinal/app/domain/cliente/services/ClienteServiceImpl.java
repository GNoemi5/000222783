package com.examenfinal.app.domain.cliente.services;

import com.examenfinal.app.domain.cliente.dto.ClienteDTO;
import com.examenfinal.app.domain.cliente.dto.ReporteDTO;
import com.examenfinal.app.domain.cliente.entities.Cliente;
import com.examenfinal.app.domain.cliente.entities.Reporte;
import com.examenfinal.app.domain.cliente.repositories.ClienteRepository;
import com.examenfinal.app.domain.cliente.repositories.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ReporteRepository reporteRepository;

    @Override
    public ClienteDTO registrar(ClienteDTO clienteDTO) {
        Cliente cliente = Cliente.builder()
                .apellidos(clienteDTO.getApellidos())
                .nombres(clienteDTO.getNombres())
                .dni(clienteDTO.getDni())
                .build();

        Cliente clienteDB = clienteRepository.registrar(cliente);

        clienteDTO.getReportes().stream().forEach(reporteDTO -> {
            Reporte reporte = Reporte.builder()
                    .fecha(reporteDTO.getFecha())
                    .motivo(reporteDTO.getDescripcion())
                    .build();

            reporteRepository.registrar(reporte);

        });

        return null;
    }

    @Override
    public ClienteDTO buscarPorDNI(String dni) {
        Cliente cliente = clienteRepository.buscarPorDNI(dni);
        List<Reporte> reportes = reporteRepository.listar(cliente);

        List<ReporteDTO> reportesDTOS = reportes.stream().map(reporte -> ReporteDTO.builder()
                .descripcion(reporte.getMotivo())
                .fecha(reporte.getFecha())
                .build())
                .collect(Collectors.toList());

        return ClienteDTO.builder()
                .apellidos(cliente.getApellidos())
                .nombres(cliente.getNombres())
                .dni(cliente.getDni())
                .reportes(reportesDTOS)
                .build();
    }
}

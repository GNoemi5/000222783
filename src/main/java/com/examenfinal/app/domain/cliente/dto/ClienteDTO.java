package com.examenfinal.app.domain.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClienteDTO {

    private String nombres;
    private String apellidos;
    private String dni;

    private List<ReporteDTO> reportes;
}

package com.examenfinal.app.domain.cliente.services;

import com.examenfinal.app.domain.cliente.dto.ClienteDTO;

public interface ClienteService {

    ClienteDTO registrar(ClienteDTO clienteDTO);

    ClienteDTO buscarPorDNI(String dni);

}

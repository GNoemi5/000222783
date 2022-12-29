package com.examenfinal.app.domain.cliente.repositories;

import com.examenfinal.app.domain.cliente.entities.Cliente;

public interface ClienteRepository {

    Cliente registrar(Cliente clienteDTO);

    Cliente buscarPorDNI(String dni);
}

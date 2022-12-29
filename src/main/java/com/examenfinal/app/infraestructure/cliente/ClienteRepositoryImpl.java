package com.examenfinal.app.infraestructure.cliente;

import com.examenfinal.app.domain.cliente.entities.Cliente;
import com.examenfinal.app.domain.cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    private ClienteJpaRepository clienteJpaRepository;

    @Override
    public Cliente registrar(Cliente cliente) {
        return clienteJpaRepository.save(cliente);
    }

    @Override
    public Cliente buscarPorDNI(String dni) {
        return clienteJpaRepository.findClienteByDni(dni);
    }
}

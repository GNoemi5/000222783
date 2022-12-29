package com.examenfinal.app.infraestructure.cliente;

import com.examenfinal.app.domain.cliente.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJpaRepository extends JpaRepository<Cliente, Integer> {
    Cliente findClienteByDni(String dni);
}

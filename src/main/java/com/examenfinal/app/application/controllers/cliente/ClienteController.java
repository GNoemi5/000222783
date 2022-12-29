package com.examenfinal.app.application.controllers.cliente;

import com.examenfinal.app.domain.cliente.dto.ClienteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;
import java.util.List;

public interface ClienteController {

    @GetMapping("/{dni}")
    public ClienteDTO buscarPorDni(@PathParam("dni") String dni);

    @PostMapping
    public ClienteDTO registrar(@RequestBody ClienteDTO clienteDTO);
}

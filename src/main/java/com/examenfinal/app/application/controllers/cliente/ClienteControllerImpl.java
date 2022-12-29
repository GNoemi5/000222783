package com.examenfinal.app.application.controllers.cliente;

import com.examenfinal.app.domain.cliente.dto.ClienteDTO;
import com.examenfinal.app.domain.cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/cliente")
public class ClienteControllerImpl implements ClienteController{

    @Autowired
    private ClienteService clienteService;

    @Override
    public ClienteDTO buscarPorDni(@PathParam("dni")String dni) {
        return clienteService.buscarPorDNI(dni);
    }

    @Override
    public ClienteDTO registrar(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.registrar(clienteDTO);
    }
}

package com.caioLessa.desafioClientes.controllers;


import com.caioLessa.desafioClientes.dto.ClientDTO;
import com.caioLessa.desafioClientes.services.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO clientDTO) {
        return clientService.insert(clientDTO);
    }
}

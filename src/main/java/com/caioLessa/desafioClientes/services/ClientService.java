package com.caioLessa.desafioClientes.services;

import com.caioLessa.desafioClientes.dto.ClientDTO;
import com.caioLessa.desafioClientes.entities.Client;
import com.caioLessa.desafioClientes.repositories.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDTO insert(ClientDTO clientDTO) {
        Client client = new Client();
        copyDtoToEntity(clientDTO, client);
        client = clientRepository.save(client);
        return new ClientDTO(client);
    }

    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = clientRepository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }

    public void copyDtoToEntity(ClientDTO clientDTO, Client client) {
        client.setId(clientDTO.getId());
        client.setName(clientDTO.getName());
        client.setCpf(clientDTO.getCpf());
        client.setIncome(clientDTO.getIncome());
        client.setBirthDate(clientDTO.getBirthDate());
        client.setChildren(clientDTO.getChildren());
    }
}

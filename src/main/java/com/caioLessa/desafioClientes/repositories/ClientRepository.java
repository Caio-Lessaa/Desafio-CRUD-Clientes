package com.caioLessa.desafioClientes.repositories;

import com.caioLessa.desafioClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

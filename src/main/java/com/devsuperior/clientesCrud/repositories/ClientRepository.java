package com.devsuperior.clientesCrud.repositories;

import com.devsuperior.clientesCrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

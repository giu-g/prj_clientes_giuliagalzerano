package com.br.giuliagalzerano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.giuliagalzerano.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
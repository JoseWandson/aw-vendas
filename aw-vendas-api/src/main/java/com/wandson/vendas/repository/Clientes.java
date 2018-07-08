package com.wandson.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandson.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}

package com.wandson.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandson.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}

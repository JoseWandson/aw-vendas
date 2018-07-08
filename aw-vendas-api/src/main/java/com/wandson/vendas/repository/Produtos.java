package com.wandson.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandson.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
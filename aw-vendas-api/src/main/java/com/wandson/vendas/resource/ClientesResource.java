package com.wandson.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wandson.vendas.model.Cliente;
import com.wandson.vendas.repository.Clientes;

@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesResource {

	@Autowired
	private Clientes clientes;

	@GetMapping
	public List<Cliente> listar() {
		return clientes.findAll();
	}
}

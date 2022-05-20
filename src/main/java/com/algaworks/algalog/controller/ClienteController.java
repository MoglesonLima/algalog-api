package com.algaworks.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("FULANO DE TALL");
		cliente1.setTelefone("8523465789");
		cliente1.setEmail("fulano@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("CICRANDO DE TALL");
		cliente2.setTelefone("8892876251");
		cliente2.setEmail("cicrano@gmail.com");

		return Arrays.asList(cliente1, cliente2);
	}
}

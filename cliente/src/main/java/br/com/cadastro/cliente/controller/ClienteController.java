package br.com.cadastro.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.cliente.constante.Const;
import br.com.cadastro.cliente.dto.ClienteDTO;
import br.com.cadastro.cliente.entity.Cliente;
import br.com.cadastro.cliente.service.ClienteService;

@RestController
@RequestMapping("/clients")
public class ClienteController {

	@Autowired
	ClienteService service;
	
	@GetMapping
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<List<Cliente>> getAllClients() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<Cliente> getClientById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@PostMapping
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<Cliente> saveClient(ClienteDTO client) {
		return service.save(client);
	}
	
	@PutMapping("/{id}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<Cliente> updateClient(ClienteDTO client, @PathVariable Long id) {
		return service.edit(client, id);
	}
	
	@DeleteMapping("/{id}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<Cliente> deleteClient(@PathVariable Long id) {
		return service.delete(id);
	}
}

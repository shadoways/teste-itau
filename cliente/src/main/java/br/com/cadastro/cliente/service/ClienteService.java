package br.com.cadastro.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.cadastro.cliente.dto.ClienteDTO;
import br.com.cadastro.cliente.entity.Cliente;
import br.com.cadastro.cliente.mapper.ClienteMapper;
import br.com.cadastro.cliente.repository.ClientRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClientRepository clientRepository;
	
	public ResponseEntity<Cliente> save(ClienteDTO clientDTO) {
		return new ResponseEntity<Cliente>( clientRepository.save(ClienteMapper.toClient(clientDTO)), HttpStatus.CREATED);
	}
	
	public ResponseEntity<Cliente> edit(ClienteDTO clientDTO, Long clientID) {
		Cliente client = ClienteMapper.toClient(clientDTO);
		client.setId(clientID);
		clientRepository.save(client);
		
		return new ResponseEntity<Cliente>(client, HttpStatus.OK);
	}
	
	public ResponseEntity<List<Cliente>> getAll() {
		return new ResponseEntity<List<Cliente>>( clientRepository.findAll(), HttpStatus.OK);
	
	}
	
	public ResponseEntity<Cliente> getById(Long id) {
		return new ResponseEntity<Cliente>(clientRepository.findById(id).get(), HttpStatus.OK);
	}
	
	public ResponseEntity<Cliente> delete(Long clientID) {
		Cliente client = clientRepository.findById(clientID).get();
		client.setStatus(0);
		clientRepository.save(client);
		
		return new ResponseEntity<Cliente>(client, HttpStatus.OK);
	}
	
}

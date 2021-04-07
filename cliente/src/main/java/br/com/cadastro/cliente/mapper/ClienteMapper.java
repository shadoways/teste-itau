package br.com.cadastro.cliente.mapper;

import br.com.cadastro.cliente.dto.ClienteDTO;
import br.com.cadastro.cliente.entity.Cliente;

public class ClienteMapper {

	public static Cliente toClient(ClienteDTO clientDTO) {
		Cliente client = new Cliente();
		
		client.setEndereco(EnderecoMapper.toAddress(clientDTO.getEndereco()));
		client.setGenero(clientDTO.getGenero());
		client.setSobrenome(clientDTO.getSobrenome());
		client.setNome(clientDTO.getNome());
		
		return client;
	}
	
}

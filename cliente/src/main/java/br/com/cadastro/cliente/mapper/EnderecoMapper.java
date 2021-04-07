package br.com.cadastro.cliente.mapper;

import br.com.cadastro.cliente.dto.EnderecoDTO;
import br.com.cadastro.cliente.entity.Endereco;

public class EnderecoMapper {

	public static Endereco toAddress(EnderecoDTO enderecoDTO) {
		
		Endereco endereco = new Endereco();
		endereco.setCidade(enderecoDTO.getCidade());
		endereco.setPais(enderecoDTO.getPais());
		endereco.setBairro(enderecoDTO.getBairro());
		endereco.setNumero(enderecoDTO.getNumero());
		endereco.setEstado(enderecoDTO.getEstado());
		endereco.setRua(enderecoDTO.getRua());
		endereco.setCep(enderecoDTO.getCep());
		
		return endereco;
	}

}

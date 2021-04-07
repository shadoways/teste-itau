package br.com.cadastro.cliente.dto;

public class ClienteDTO {
	
	private String id;
	private String nome;
	private String sobrenome;
	private String genero;
	private EnderecoDTO endereco;
	
	public String getId() {
		return id;
	}
	public void String(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}

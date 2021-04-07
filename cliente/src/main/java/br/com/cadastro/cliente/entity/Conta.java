package br.com.cadastro.cliente.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conta {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long agencia;
	private Long numero;
	
    @OneToOne(mappedBy = "conta")
    private Cliente cliente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAgencia() {
		return agencia;
	}
	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}

}

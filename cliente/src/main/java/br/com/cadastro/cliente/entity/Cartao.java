package br.com.cadastro.cliente.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	private BigDecimal saldo;
	private BigDecimal limite;
	private String tipo;
	
    @OneToOne(mappedBy = "cartao")
    private Cliente cliente;
	
	Long getId() {
		return id;
	}
	void setId(Long id) {
		this.id = id;
	}
	String getNumero() {
		return numero;
	}
	void setNumero(String numero) {
		this.numero = numero;
	}
	BigDecimal getSaldo() {
		return saldo;
	}
	void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	BigDecimal getLimite() {
		return limite;
	}
	void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	String getTipo() {
		return tipo;
	}
	void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

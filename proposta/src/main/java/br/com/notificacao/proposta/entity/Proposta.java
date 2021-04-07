package br.com.notificacao.proposta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String documento;
	private String message;

	public static Proposta builder() {
		return new Proposta();
	}
	
	public Proposta build() {
		return this;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumento() {
		return documento;
	}
	public Proposta setDocumento(String documento) {
		this.documento = documento;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public Proposta setMessage(String message) {
		this.message = message;
		return this;
	}
	
}

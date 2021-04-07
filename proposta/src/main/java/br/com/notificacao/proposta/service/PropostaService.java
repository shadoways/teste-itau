package br.com.notificacao.proposta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import br.com.notificacao.proposta.entity.Proposta;
import br.com.notificacao.proposta.repository.PropostaRepository;

@Service
public class PropostaService {
	@Autowired
	private PropostaRepository repository;
	
	public ResponseEntity<String>getNotificacao(String documento){
		Proposta proposta = repository.findByDocumento(documento);
		return new ResponseEntity<String>(proposta.getMessage(), HttpStatus.OK);
	}
	
	@JmsListener(destination = "${spring.fila}")
	private void getNotificacaoMQ(String str) {
		String documento = str.substring(0, 9);
		String message = str.substring(9, 50);
		
		repository.save(Proposta.builder()
							.setDocumento(documento)
							.setMessage(message)
							.build());
	}
}

package br.com.analise.credito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreditoService {
	@Autowired 
	private JmsTemplate jmsTemplate;
	@Value("${spring.fila}")
	private String fila;
	
	public ResponseEntity<String> analiseCredito(String documento){
		if("123456789".equals(documento)) {
			jmsTemplate.convertAndSend(fila, documento + "credito aprovado");
			return new ResponseEntity<String>("Aprovado", HttpStatus.OK);
		}
		jmsTemplate.convertAndSend(fila, documento + "credito reprovado");
		return new ResponseEntity<String>("reprovado", HttpStatus.OK);
	}
}

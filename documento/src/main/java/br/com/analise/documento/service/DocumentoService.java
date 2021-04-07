package br.com.analise.documento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DocumentoService {
	@Autowired 
	private JmsTemplate jmsTemplate;
	@Value("${spring.fila}")
	private String fila;
	
	public ResponseEntity<String> analiseDocumento(String documento) {
		if("123456789".equals(documento)) {
			jmsTemplate.convertAndSend(fila, documento + "documento aprovado");
			return new ResponseEntity<String>("aprovado", HttpStatus.OK);
		}
		jmsTemplate.convertAndSend(fila, documento + "documento reprovado");
		return new ResponseEntity<String>("reprovado", HttpStatus.OK);
	}
}

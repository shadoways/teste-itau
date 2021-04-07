package br.com.analise.fraude.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class FraudeService {
	@Autowired 
	private JmsTemplate jmsTemplate;
	@Value("${spring.fila}")
	private String fila;
	
	public ResponseEntity<String> analiseFraude(String documento) {
		if("123456789".equals(documento)) {
			jmsTemplate.convertAndSend(fila, documento + "regular");
			return new ResponseEntity<String>("regular", HttpStatus.OK);
		}
		
		jmsTemplate.convertAndSend(fila, documento + "fraude");
		return new ResponseEntity<String>("fraude", HttpStatus.OK);
	}
}

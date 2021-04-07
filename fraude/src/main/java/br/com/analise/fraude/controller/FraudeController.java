package br.com.analise.fraude.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.analise.fraude.constante.Const;
import br.com.analise.fraude.service.FraudeService;

@RestController
@RequestMapping("/fraude")
public class FraudeController {
	
	@Autowired
	FraudeService service;
	
	@GetMapping("/documento")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<String> analiseFraude(@PathVariable String documento){
		return service.analiseFraude(documento);
	}
	
}

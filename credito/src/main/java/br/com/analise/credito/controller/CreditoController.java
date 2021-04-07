package br.com.analise.credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.analise.credito.constante.Const;
import br.com.analise.credito.service.CreditoService;

@RestController
@RequestMapping("/analise")
public class CreditoController {
	
	@Autowired
	CreditoService service;
	
	@GetMapping("/{documento}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<String> analiseCredito(@PathVariable String documento) {
		return service.analiseCredito(documento);
	}
	
}

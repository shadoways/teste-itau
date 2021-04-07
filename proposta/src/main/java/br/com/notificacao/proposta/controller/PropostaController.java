package br.com.notificacao.proposta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.notificacao.proposta.constante.Const;
import br.com.notificacao.proposta.service.PropostaService;

@RestController
@RequestMapping("/proposta")
public class PropostaController {
	@Autowired
	PropostaService service;
	
	@GetMapping("/{documento}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<String> getProposta(@PathVariable String documento){
		return service.getNotificacao(documento);
	}
}

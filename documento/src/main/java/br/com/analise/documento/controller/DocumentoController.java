package br.com.analise.documento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.analise.documento.constante.Const;
import br.com.analise.documento.service.DocumentoService;

@RestController
@RequestMapping("/documento")
public class DocumentoController {
	
	@Autowired
	DocumentoService service;
	
	@GetMapping("/{documento}")
	@Secured({Const.ROLE_CLIENT})
	public ResponseEntity<String> analiseDocumento(@PathVariable String documento) {
		return service.analiseDocumento(documento);
	}

}

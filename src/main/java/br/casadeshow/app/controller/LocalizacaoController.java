package br.casadeshow.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.casadeshow.app.model.Localizacao;
import br.casadeshow.app.service.LocalizacaoService;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

	@Autowired
	private LocalizacaoService service;

	@GetMapping
	public ResponseEntity<Iterable<Localizacao>> listar() {
		Iterable<Localizacao> bandas = service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(bandas);
	}

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody Localizacao localizacao) {
		service.inserir(localizacao);
		return ResponseEntity.status(HttpStatus.CREATED).body("Banda inserido com sucesso!");
	}
}

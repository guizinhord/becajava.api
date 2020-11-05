package br.casadeshow.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.casadeshow.app.model.Musico;
import br.casadeshow.app.service.MusicoService;

@RestController
@RequestMapping("/Musicos")
public class MusicoController {

	@Autowired
	private MusicoService service;

	@GetMapping
	public ResponseEntity<Iterable<Musico>> listar() {
		Iterable<Musico> musico = service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(musico);
	}

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody Musico musico) {
		service.inserir(musico);
		return ResponseEntity.status(HttpStatus.CREATED).body("Banda inserido com sucesso!");
	}
}

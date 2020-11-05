package br.casadeshow.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.casadeshow.app.model.Promocao;
import br.casadeshow.app.service.PromocaoService;

@RestController
@RequestMapping("/promocoes")
public class PromocaoController {

	@Autowired
	private PromocaoService service;

	@GetMapping
	public ResponseEntity<Iterable<Promocao>> listar() {
		Iterable<Promocao> promocao = service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(promocao);
	}

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody Promocao promocao) {
		service.inserir(promocao);
		return ResponseEntity.status(HttpStatus.CREATED).body("Banda inserido com sucesso!");
	}

}

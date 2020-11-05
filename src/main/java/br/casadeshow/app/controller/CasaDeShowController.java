package br.casadeshow.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.casadeshow.app.model.CasaDeShow;
import br.casadeshow.app.service.CasaDeShowService;

@RestController
@RequestMapping("/shows")
public class CasaDeShowController {

	@Autowired
	private CasaDeShowService service;

	@GetMapping
	public ResponseEntity<Iterable<CasaDeShow>> listar() {
		Iterable<CasaDeShow> casadeshow = service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(casadeshow);
	}

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody CasaDeShow casadeshow) {
		service.inserir(casadeshow);
		return ResponseEntity.status(HttpStatus.CREATED).body("Casa inserida com sucessso!");
	}

}

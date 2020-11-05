package br.casadeshow.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.casadeshow.app.model.Banda;
import br.casadeshow.app.service.BandaService;

@RestController
@RequestMapping("/bandas")
public class BandaController {

	@Autowired
	private BandaService service;

	@GetMapping
	public ResponseEntity<Iterable<Banda>> listar() {
		Iterable<Banda> bandas = service.listar();
		return ResponseEntity.status(HttpStatus.OK).body(bandas);
	}

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody Banda banda) {
		service.inserir(banda);
		return ResponseEntity.status(HttpStatus.CREATED).body("Banda inserido com sucesso!");
	}
	
//	@PutMapping(path = "/{id}")
//	public ResponseEntity<String> atualizar(@RequestBody Banda banda, @PathVariable Long id){
//		service.atualizar(banda);
//		return ResponseEntity.status(HttpStatus.OK).body("Banda atualizada com sucesso!");
//	}
}

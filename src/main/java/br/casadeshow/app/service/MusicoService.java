package br.casadeshow.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.casadeshow.app.model.Musico;
import br.casadeshow.app.repository.MusicoRepository;

@Service
public class MusicoService {

	@Autowired
	private MusicoRepository repository;

	public List<Musico> listar() {
		return repository.findAll();
	}

	public void inserir(Musico musico) {
		musico.setId(new Long(0));
		repository.save(musico);
	}
}

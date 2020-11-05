package br.casadeshow.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.casadeshow.app.model.CasaDeShow;
import br.casadeshow.app.repository.CasaDeShowRepository;

@Service
public class CasaDeShowService {

	@Autowired
	private CasaDeShowRepository repository;

	public List<CasaDeShow> listar() {
		return repository.findAll();
	}

	public void inserir(CasaDeShow casadeshow) {
		casadeshow.setId(new Long(0));
		repository.save(casadeshow);
	}
}

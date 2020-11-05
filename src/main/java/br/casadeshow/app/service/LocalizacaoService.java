package br.casadeshow.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.casadeshow.app.model.Localizacao;
import br.casadeshow.app.repository.LocalizacaoRepository;

@Service
public class LocalizacaoService {

	@Autowired
	private LocalizacaoRepository repository;

	public List<Localizacao> listar() {
		return repository.findAll();
	}

	public void inserir(Localizacao localizacao) {
		localizacao.setId(new Long(0));
		repository.save(localizacao);
	}
}

package br.casadeshow.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.casadeshow.app.model.Promocao;
import br.casadeshow.app.repository.PromocaoRepository;

@Service
public class PromocaoService {

	@Autowired
	private PromocaoRepository repository;

	public List<Promocao> listar() {
		return repository.findAll();
	}

	public void inserir(Promocao promocao) {
		promocao.setId(new Long(0));
		repository.save(promocao);
	}
}

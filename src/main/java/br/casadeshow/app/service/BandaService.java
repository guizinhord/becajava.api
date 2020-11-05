package br.casadeshow.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.casadeshow.app.model.Banda;
import br.casadeshow.app.repository.BandaRepository;

@Service
public class BandaService {

	@Autowired
	private BandaRepository repository;
	
	public List<Banda> listar() {
		return repository.findAll();
	}
	

	public void inserir(Banda banda) {
		banda.setId(new Long(0));
		repository.save(banda);
	}
	
//	public void atualizar(Banda banda) {
//		banda.setId(id);
//		repository.save(banda);
//	}

}

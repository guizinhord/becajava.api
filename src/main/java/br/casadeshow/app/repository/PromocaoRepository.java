package br.casadeshow.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.casadeshow.app.model.Promocao;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Long>{

}

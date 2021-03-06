package br.casadeshow.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.casadeshow.app.model.Banda;

@Repository
public interface BandaRepository extends JpaRepository<Banda, Long> {

}

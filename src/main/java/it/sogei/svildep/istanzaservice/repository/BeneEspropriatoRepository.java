package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestioneistanze.BeneEspropriato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneEspropriatoRepository extends JpaRepository<BeneEspropriato, Long> {
}

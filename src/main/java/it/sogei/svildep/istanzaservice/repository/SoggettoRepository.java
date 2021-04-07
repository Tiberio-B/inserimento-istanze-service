package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoggettoRepository extends JpaRepository<Soggetto, Long> {
}

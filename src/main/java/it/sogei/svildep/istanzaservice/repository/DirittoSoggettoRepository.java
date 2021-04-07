package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirittoSoggettoRepository extends JpaRepository<DirittoSoggetto, Long> {
}

package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IndirizzoRepository extends JpaRepository<Indirizzo, Long> {

    Optional<Indirizzo> findBySoggetto(Soggetto soggetto);
}

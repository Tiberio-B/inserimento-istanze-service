package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionerts.CompetenzaRts;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompetenzaRtsRepository extends JpaRepository<CompetenzaRts, Long> {

    Optional<CompetenzaRts> findByProvincia(Provincia provincia);
}

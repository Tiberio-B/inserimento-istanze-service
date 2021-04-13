package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import it.sogei.svildep.istanzaservice.entity.gestionerts.RTS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RtsRepository extends JpaRepository<RTS, Long> {

    Optional<RTS> findByComune(Comune comune);
}

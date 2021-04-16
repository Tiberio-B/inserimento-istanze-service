package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionerts.Rts;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RtsRepository extends JpaRepository<Rts, Long> {

    Optional<Rts> findByComune(Comune comune);
}

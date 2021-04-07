package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FascicoloRepository extends JpaRepository<Fascicolo, Long> {
}

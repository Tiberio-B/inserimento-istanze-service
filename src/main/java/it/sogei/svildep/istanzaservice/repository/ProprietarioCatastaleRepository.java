package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestioneistanze.ProprietarioCatastale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioCatastaleRepository extends JpaRepository<ProprietarioCatastale, Long> {
}

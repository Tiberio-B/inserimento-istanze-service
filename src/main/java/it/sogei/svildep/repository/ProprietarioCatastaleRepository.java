package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestioneistanze.ProprietarioCatastale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioCatastaleRepository extends JpaRepository<ProprietarioCatastale, Long> {
}

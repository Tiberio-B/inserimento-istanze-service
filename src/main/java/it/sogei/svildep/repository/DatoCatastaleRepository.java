package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestioneistanze.Opera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatoCatastaleRepository extends JpaRepository<DatoCatastale, Long> {
}

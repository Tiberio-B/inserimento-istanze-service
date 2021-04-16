package it.sogei.svildep.repository;

import it.sogei.svildep.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.entity.gestioneistanze.StatoIstanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatoIstanzaRepository extends JpaRepository<StatoIstanza, Long> {

    Optional<StatoIstanza> findByCodice(FlagStatoIstanza flagCodice);
}

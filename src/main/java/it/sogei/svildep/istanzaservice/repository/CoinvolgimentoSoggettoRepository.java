package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestioneistanze.CoinvolgimentoSoggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinvolgimentoSoggettoRepository extends JpaRepository<CoinvolgimentoSoggetto, Long> {
}

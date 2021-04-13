package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoinvolgimentoSoggettoRepository extends JpaRepository<CoinvolgimentoSoggetto, Long> {

    Optional<CoinvolgimentoSoggetto> findByCodiceAndIstanza(FlagTipoCoinvolgimento codice, Istanza istanza);
}

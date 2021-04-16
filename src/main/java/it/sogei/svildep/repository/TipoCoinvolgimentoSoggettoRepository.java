package it.sogei.svildep.repository;

import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoCoinvolgimentoSoggettoRepository extends JpaRepository<TipoCoinvolgimentoSoggetto, Long> {

    Optional<TipoCoinvolgimentoSoggetto> findByFlagTipoCoinvolgimento(FlagTipoCoinvolgimento flagCodice);
}

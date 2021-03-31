package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CoinvolgimentoSoggettoMapper implements DtoToEntityMapper<CoinvolgimentoSoggetto, CoinvolgimentoSoggettoDto> {

    @Override
    public CoinvolgimentoSoggetto mapDtoToEntityImpl(CoinvolgimentoSoggettoDto dto) throws NumberFormatException {
        CoinvolgimentoSoggetto entity = new CoinvolgimentoSoggetto();

        TipoCoinvolgimentoSoggetto tipo = new TipoCoinvolgimentoSoggetto();
        tipo.setId(Long.parseLong(dto.getTipoCoinvolgimentoSoggettoId()));
        entity.setTipoCoinvolgimentoSoggetto(tipo);

        Soggetto soggetto = new Soggetto();
        soggetto.setId(Long.parseLong(dto.getSoggettoId()));
        entity.setSoggetto(soggetto);

        return entity;
    }
}

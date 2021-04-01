package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class CoinvolgimentoSoggettoMapper implements DtoToEntityMapper<CoinvolgimentoSoggetto, CoinvolgimentoSoggettoDto> {

    @Override
    public CoinvolgimentoSoggetto mapDtoToEntityImpl(CoinvolgimentoSoggettoDto dto) throws RuntimeException {
        CoinvolgimentoSoggetto entity = new CoinvolgimentoSoggetto();

        TipoCoinvolgimentoSoggetto tipoCoinvolgimentoSoggetto = new TipoCoinvolgimentoSoggetto();
        tipoCoinvolgimentoSoggetto.setId(Long.parseLong(dto.getTipoCoinvolgimentoSoggettoId()));
        entity.setTipoCoinvolgimentoSoggetto(tipoCoinvolgimentoSoggetto);

        Soggetto soggetto = new Soggetto();
        soggetto.setId(Long.parseLong(dto.getSoggettoId()));
        entity.setSoggetto(soggetto);

        return entity;
    }
}

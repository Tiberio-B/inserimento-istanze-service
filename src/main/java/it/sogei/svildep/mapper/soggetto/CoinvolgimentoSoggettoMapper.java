package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.mapper.DtoToEntityMapper;
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

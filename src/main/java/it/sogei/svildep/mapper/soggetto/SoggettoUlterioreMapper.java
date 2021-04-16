package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.istanza.depGiudiziario.SoggettoUlterioreDto;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoUlteriore;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class SoggettoUlterioreMapper implements DtoToEntityMapper<SoggettoUlteriore, SoggettoUlterioreDto> {


    @Override
    public SoggettoUlteriore mapDtoToEntityImpl(SoggettoUlterioreDto dto) throws RuntimeException {
        SoggettoUlteriore entity = new SoggettoUlteriore();

        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setCodiceFiscale(dto.getCfPiva());

        return entity;
    }
}

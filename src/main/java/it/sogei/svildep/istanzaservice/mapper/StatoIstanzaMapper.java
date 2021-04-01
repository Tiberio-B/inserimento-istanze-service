package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.StatoIstanza;
import org.springframework.stereotype.Component;

@Component
public class StatoIstanzaMapper implements DtoToEntityMapper<StatoIstanza, CostituzioneDepositoDto> {

    @Override
    public StatoIstanza mapDtoToEntityImpl(CostituzioneDepositoDto dto) throws RuntimeException {
        StatoIstanza entity = new StatoIstanza();

        FlagStatoIstanza statoIstanza = dto.getInserimentoManuale()? FlagStatoIstanza.SIB : FlagStatoIstanza.SII;

        entity.setCodice(statoIstanza);
        entity.setDescrizione(statoIstanza.getDescrizione());
        return entity;
    }
}

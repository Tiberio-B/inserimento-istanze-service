package it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.Opera;
import it.sogei.svildep.entity.gestionesoggetti.Regione;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CostituzioneDepAmministrativoMapper extends CostituzioneDepositoMapper<CostituzioneDepAmministrativoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDepAmministrativoDto dto) throws RuntimeException {
        Istanza entity = getIstanzaMapper().mapDtoToEntityImpl(dto);

        Opera opera = new Opera();
        opera.setDescrizioneOpera(dto.getOperaDescrizione());

        Regione regione = new Regione();
        regione.setId(Long.parseLong(dto.getOperaRegioneId()));
        opera.setRegione(regione);
        entity.setOpera(opera);

        return entity;
    }
}

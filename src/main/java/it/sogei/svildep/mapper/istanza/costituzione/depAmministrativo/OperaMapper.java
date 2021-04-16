package it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.dto.istanza.depAmministrativo.OperaDto;
import it.sogei.svildep.entity.gestioneistanze.Opera;
import it.sogei.svildep.entity.gestionesoggetti.Regione;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OperaMapper implements DtoToEntityMapper<Opera, OperaDto> {


    @Override
    public Opera mapDtoToEntityImpl(OperaDto dto) throws RuntimeException {
        Opera entity = new Opera();
        entity.setDescrizioneOpera(dto.getDescrizione());

        Regione regione = new Regione();
        regione.setId(Long.parseLong(dto.getRegioneId()));
        entity.setRegione(regione);
        return entity;
    }
}

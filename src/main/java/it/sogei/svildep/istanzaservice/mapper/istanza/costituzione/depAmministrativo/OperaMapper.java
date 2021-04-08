package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.OperaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Opera;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Regione;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OperaMapper implements DtoToEntityMapper<Opera, OperaDto> {


    @Override
    public Opera mapDtoToEntityImpl(OperaDto dto) throws RuntimeException {
        Opera entity = new Opera();
        entity.setDescrizione(dto.getDescrizione());

        Regione regione = new Regione();
        regione.setId(Long.parseLong(dto.getRegioneId()));
        entity.setRegione(regione);
        return entity;
    }
}

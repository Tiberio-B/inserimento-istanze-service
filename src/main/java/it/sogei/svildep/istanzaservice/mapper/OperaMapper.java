package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Regione;
import org.springframework.stereotype.Component;

@Component
public class OperaMapper implements Mapper<Opera, OperaDto> {

    @Override
    public OperaDto mapEntityToDtoImpl(Opera entity) {
        OperaDto dto = new OperaDto();
        dto.setDescrizione(entity.getDescrizione());
        dto.setRegione(entity.getRegione().toString());
        return dto;
    }

    @Override
    public Opera mapDtoToEntityImpl(OperaDto dto) throws IllegalArgumentException {
        Opera entity = new Opera();
        entity.setDescrizione(dto.getDescrizione());

        String regione = dto.getRegione();
        entity.setRegione(regione != null? Regione.valueOf(regione) : null);
        return entity;
    }
}

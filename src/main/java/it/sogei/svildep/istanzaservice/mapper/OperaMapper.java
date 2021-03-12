package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.geo.Regione;
import it.sogei.svildep.istanzaservice.model.Opera;
import org.springframework.stereotype.Component;

@Component
public class OperaMapper implements Mapper<Opera, OperaDto> {

    @Override
    public OperaDto convertEntityToDtoImpl(Opera entity) {
        OperaDto dto = new OperaDto();
        dto.setDescrizione(entity.getDescrizione());
        dto.setRegione(entity.getRegione().toString());
        return dto;
    }

    @Override
    public Opera convertDtoToEntityImpl(OperaDto dto) throws SvildepException {
        Opera entity = new Opera();
        entity.setDescrizione(dto.getDescrizione());
        try {
            entity.setRegione(Regione.valueOf(dto.getRegione()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getMessage());
        }
        return entity;
    }
}

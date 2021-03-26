package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class IstanzaRicercaMapper extends IstanzaMapper<IstanzaRicercaDto> {

    @Override
    public IstanzaRicercaDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaRicercaDto dto = super.daIstanzaADto(entity, new IstanzaRicercaDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaRicercaDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}

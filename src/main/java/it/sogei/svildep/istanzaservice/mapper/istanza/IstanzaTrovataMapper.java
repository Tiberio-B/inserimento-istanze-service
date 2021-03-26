package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class IstanzaTrovataMapper extends IstanzaMapper<IstanzaTrovataDto> {


    @Override
    public IstanzaTrovataDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaTrovataDto dto = super.daIstanzaADto(entity, new IstanzaTrovataDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaTrovataDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}

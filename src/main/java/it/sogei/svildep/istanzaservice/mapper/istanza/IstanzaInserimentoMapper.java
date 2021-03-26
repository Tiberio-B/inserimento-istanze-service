package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaInserimentoMapper<D extends IstanzaInserimentoDto> extends IstanzaMapper<D> {

    public Dto mapEntityToDto(Istanza entity, Dto dto) {
        // dto.setRtsInoltroId(entity);
        // dto.setModalitaTrasmissione(entity);
        // dto.setQualitaRichiedente(entity);
        return dto;
    }

    public Istanza mapDtoToEntityImpl(Dto dto, Istanza entity) {
        // entity.setRtsInoltroId(dto);
        // entity.setModalitaTrasmissione(dto);
        // entity.setQualitaRichiedente(dto);
        return entity;
    }
}

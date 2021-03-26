package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class InserimentoIstanzaMapper<Entity extends Istanza, Dto extends IstanzaDtoInserimento> extends IstanzaMapper<Entity, Dto> {

    public Dto mapEntityToDtoImpl(Entity entity, Dto dto) {
        // dto.setRtsInoltroId(entity);
        // dto.setModalitaTrasmissione(entity);
        // dto.setQualitaRichiedente(entity);
        return dto;
    }

    public Entity mapDtoToEntityImpl(Dto dto, Entity entity) {
        // entity.setRtsInoltroId(dto);
        // entity.setModalitaTrasmissione(dto);
        // entity.setQualitaRichiedente(dto);
        return entity;
    }
}

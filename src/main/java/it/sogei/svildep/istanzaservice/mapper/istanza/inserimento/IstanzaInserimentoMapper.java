package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Getter
@NoArgsConstructor
public abstract class IstanzaInserimentoMapper<D extends IstanzaInserimentoDto> implements DtoToEntityMapper<Istanza, D> {

    @Autowired private IstanzaMapper istanzaMapper;
}

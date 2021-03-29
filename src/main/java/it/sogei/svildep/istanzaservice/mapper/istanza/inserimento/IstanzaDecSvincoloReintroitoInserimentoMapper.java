package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDecSvincoloReintroitoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDecSvincoloReintroitoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDecSvincoloReintroitoInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDecSvincoloReintroitoInserimentoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}

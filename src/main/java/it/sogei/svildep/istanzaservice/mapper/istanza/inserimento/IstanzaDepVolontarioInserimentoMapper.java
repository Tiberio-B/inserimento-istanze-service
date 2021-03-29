package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepVolontarioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepVolontarioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepVolontarioInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepVolontarioInserimentoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}

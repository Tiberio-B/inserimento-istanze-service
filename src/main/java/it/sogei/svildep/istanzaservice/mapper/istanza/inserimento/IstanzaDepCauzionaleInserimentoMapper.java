package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepCauzionaleInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepCauzionaleInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepCauzionaleInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepCauzionaleInserimentoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}

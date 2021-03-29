package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepGiudiziarioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepGiudiziarioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepGiudiziarioInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepGiudiziarioInserimentoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}

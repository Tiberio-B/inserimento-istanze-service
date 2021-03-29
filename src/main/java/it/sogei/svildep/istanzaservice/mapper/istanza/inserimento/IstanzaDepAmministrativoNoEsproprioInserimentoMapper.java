package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoNoEsproprioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepAmministrativoNoEsproprioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepAmministrativoNoEsproprioInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepAmministrativoNoEsproprioInserimentoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}

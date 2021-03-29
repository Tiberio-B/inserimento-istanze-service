package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Bene;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Opera;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepAmministrativoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepAmministrativoInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepAmministrativoInserimentoDto dto) throws RuntimeException {
        Istanza entity = getIstanzaMapper().mapDtoToEntityImpl(dto);
        Opera opera = new Opera();
        opera.setId(Long.parseLong(dto.getOperaId()));
        entity.setOpera(opera);
        Bene bene = new Bene();
        bene.setId(Long.parseLong(dto.getBeneEspropriatoId()));
        entity.setBeneEspropriato(bene);
        return entity;
    }
}

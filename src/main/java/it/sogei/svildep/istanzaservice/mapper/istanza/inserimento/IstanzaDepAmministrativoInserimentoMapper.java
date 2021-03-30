package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Opera;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Regione;
import it.sogei.svildep.istanzaservice.mapper.BeneEspropriatoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaDepAmministrativoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepAmministrativoInserimentoDto> {

    private final BeneEspropriatoMapper beneEspropriatoMapper;

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepAmministrativoInserimentoDto dto) throws RuntimeException {
        Istanza entity = getIstanzaMapper().mapDtoToEntityImpl(dto);

        Opera opera = new Opera();
        opera.setDescrizione(dto.getOperaDescrizione());

        Regione regione = new Regione();
        regione.setId(Long.parseLong(dto.getOperaRegioneId()));
        opera.setRegione(regione);
        entity.setOpera(opera);

        entity.setBeneEspropriato(beneEspropriatoMapper.mapDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }
}

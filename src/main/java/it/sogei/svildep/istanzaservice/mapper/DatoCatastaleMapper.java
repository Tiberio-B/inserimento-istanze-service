package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DatoCatastaleDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.TipoCatasto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import org.springframework.stereotype.Component;

@Component
public class DatoCatastaleMapper implements DtoToEntityMapper<DatoCatastale, DatoCatastaleDto> {

    @Override
    public DatoCatastale mapDtoToEntityImpl(DatoCatastaleDto dto) throws RuntimeException {
        DatoCatastale entity = new DatoCatastale();
        entity.setFoglio(dto.getFoglio());
        entity.setParticella(dto.getParticella());
        entity.setSezioneUrbana(dto.getSezioneUrbana());
        entity.setSubalterno(dto.getSubalterno());

        TipoCatasto tipoCatasto = new TipoCatasto();
        tipoCatasto.setId(Long.parseLong(dto.getTipoCatastoId()));
        entity.setTipoCatasto(tipoCatasto);

        Comune comune = new Comune();
        comune.setId(Long.parseLong(dto.getComuneId()));
        entity.setComune(comune);

        return entity;
    }
}

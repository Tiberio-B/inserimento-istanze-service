package it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.dto.istanza.depAmministrativo.EsproprioDto;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestionedepositi.TipoCatasto;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EsproprioMapper implements DtoToEntityMapper<DatoCatastale, EsproprioDto> {

    private final ProprietarioCatastaleMapper proprietarioCatastaleMapper;

    public DatoCatastale mapDtoToEntityImpl(EsproprioDto dto) throws RuntimeException {
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

package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.ProprietarioCatastaleDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.ProprietarioCatastale;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ProprietarioCatastaleMapper implements DtoToEntityMapper<ProprietarioCatastale, ProprietarioCatastaleDto> {

    @Override
    public ProprietarioCatastale mapDtoToEntityImpl(ProprietarioCatastaleDto dto) throws RuntimeException {
        ProprietarioCatastale entity = new ProprietarioCatastale();
        entity.setNominativo(dto.getNominativo());
        entity.setCfPiva(dto.getCfPiva());
        entity.setSoggettoIrreperibile(FlagSN.valueOf(dto.getSoggettoIrreperibile()));

        Fascicolo fascicolo = new Fascicolo();
        fascicolo.setDocumentoAllegato(dto.getDocumentoRelataNotifica());
        entity.setDocumentoRelataNotifica(fascicolo);
        return entity;
    }
}

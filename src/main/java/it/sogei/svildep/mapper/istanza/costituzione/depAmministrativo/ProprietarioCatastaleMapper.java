package it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.dto.istanza.depAmministrativo.ProprietarioCatastaleDto;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.entity.gestioneistanze.ProprietarioCatastale;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ProprietarioCatastaleMapper implements DtoToEntityMapper<ProprietarioCatastale, ProprietarioCatastaleDto> {

    @Override
    public ProprietarioCatastale mapDtoToEntityImpl(ProprietarioCatastaleDto dto) throws RuntimeException {
        ProprietarioCatastale entity = new ProprietarioCatastale();
        entity.setNominativoProprietario(dto.getNominativo());
        entity.setCfPiva(dto.getCfPiva());
        entity.setSoggettoIrreperibile(FlagSN.valueOf(dto.getSoggettoIrreperibile()));

        Fascicolo fascicolo = new Fascicolo();
        fascicolo.setDocumentoAllegato(dto.getDocumentoRelataNotifica());
        entity.setFascicolo(fascicolo);
        return entity;
    }
}

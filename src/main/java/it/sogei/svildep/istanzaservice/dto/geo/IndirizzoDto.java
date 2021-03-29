package it.sogei.svildep.istanzaservice.dto.geo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends SvildepDto {

    private String descrizioneIndirizzo;
    private String numCivico;

}

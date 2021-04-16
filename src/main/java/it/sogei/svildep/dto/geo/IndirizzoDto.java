package it.sogei.svildep.dto.geo;

import it.sogei.svildep.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends SvildepDto {

    private String descrizioneIndirizzo;
    private String numCivico;

}

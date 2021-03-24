package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends Dto {

    private String descrizioneIndirizzo;
    private String numCivico;

}

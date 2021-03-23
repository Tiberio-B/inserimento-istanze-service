package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends NascitaDto {

    private String descrizioneIndirizzo;
    private String numCivico;
    private String cap;
}

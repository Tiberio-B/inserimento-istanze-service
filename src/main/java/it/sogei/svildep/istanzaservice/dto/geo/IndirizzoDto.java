package it.sogei.svildep.istanzaservice.dto.geo;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndirizzoDto extends Dto {

    private NazioneDto nazione;
    private ComuneDto comune;
    private String provincia;
    private String cap;
    private String indirizzo;
    private String civico;
}

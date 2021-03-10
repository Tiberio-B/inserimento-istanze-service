package it.sogei.svildep.istanzaservice.dto.geo;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.geo.Indirizzo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class IndirizzoDto extends Dto {

    private NazioneDto nazione;
    private String provincia;
    private String comune;
    private String cap;
    private String indirizzo;
    private String civico;
}

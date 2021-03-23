package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeneEspropriatoDto {

    private String tipoCatasto;
    private String sezioneUrbana;
    private String foglio;
    private String provincia;
    private String comune;
    private String subalterno;
    private String particella;
    private String nominativo;
    private String cf;
    private String partitaIva;
    private String tipoSoggetto;
    private String soggettoIrreperibile; //flag
}

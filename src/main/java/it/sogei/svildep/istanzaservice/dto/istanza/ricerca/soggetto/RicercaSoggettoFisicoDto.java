package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaSoggettoFisicoDto extends RicercaSoggettoDto {

    private String cognome;
    private String nome;
    private String dataNascita;

}

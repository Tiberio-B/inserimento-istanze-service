package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoFisicoRicercaDto extends SoggettoRicercaDto {

    private String cognome;
    private String nome;
    private String dataNascita;

}

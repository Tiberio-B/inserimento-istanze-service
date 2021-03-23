package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.IndirizzoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.NascitaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.RecapitoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoFisicoDto {

    private String cf;
    private String cognome;
    private String nome;
    private String sesso;
    private String dataNascita;
    private NascitaDto nascita;
    private IndirizzoDto indirizzo;
    private RecapitoDto recapito;
}

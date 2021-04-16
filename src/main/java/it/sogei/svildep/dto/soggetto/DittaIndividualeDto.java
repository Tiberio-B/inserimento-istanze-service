package it.sogei.svildep.dto.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DittaIndividualeDto extends SoggettoDto {

    private String cognome;
    private String nome;
    private String denominazioneDitta;
    private String partitaIva;

}

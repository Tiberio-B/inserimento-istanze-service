package it.sogei.svildep.istanzaservice.dto.istanza.ricerca;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoRicercaDto extends Dto {

    private String dataNascita;
    private String ragioneSociale;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSede;
    private String denominazioneDitta;
    private String cf;
    private String nome;
    private String cognome;
    private String partitaIva;
}

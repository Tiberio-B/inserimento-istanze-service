package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Provincia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DittaIndividualeDto extends SoggettoDto {

    private String cognome;
    private String nome;
    private String dataNascita;

    private String denominazioneDitta;
    private String partitaIva;
    private String comuneSede;
    private String provinciaSede;

}

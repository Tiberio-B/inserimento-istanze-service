package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class SoggettoDto extends Dto {

    private String codiceFiscale;
    private String certificatoAnagrafeTributaria;
    private String tipoSoggetto;
    private String nonIdentificato;
    private List<IndirizzoDto> indirizzi;

}

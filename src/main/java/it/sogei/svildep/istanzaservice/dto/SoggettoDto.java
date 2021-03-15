package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import it.sogei.svildep.istanzaservice.model.Soggetto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter

public class SoggettoDto extends Dto {

    private String soggettoNonIdentificato;

    private String cf;
    private String nome;
    private String cognome;
    private String partitaIva;

    private String tipoSoggetto;
    private String categoriaSoggetto;

    private String irreperibile;
    private DocumentoDto relataNotificaSoggettoNonReperibile;
    
    private String sesso;
    private IndirizzoDto nasctia;
}

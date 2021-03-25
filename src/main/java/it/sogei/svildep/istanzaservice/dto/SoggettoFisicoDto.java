package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.NascitaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SoggettoFisicoDto extends SoggettoDto {

    private String cognome;
    private String nome;
    private String sesso;
    private String dataNascita;
    private NascitaDto luogoNascita;

}

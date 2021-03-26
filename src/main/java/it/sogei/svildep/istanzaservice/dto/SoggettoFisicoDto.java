package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoFisicoDto extends SoggettoDto {

    private String cognome;
    private String nome;
    private String sesso;
    private String dataNascita;
    private NascitaDto luogoNascita;

}

package it.sogei.svildep.dto.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoFisicoDto extends SoggettoDto {

    private String cognome;
    private String nome;
    private String dataNascita;

}

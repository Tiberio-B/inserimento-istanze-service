package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class OperaDto extends Dto {

    @NotBlank private String descrizione;
    private String regione;
}

package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProtocolloDto extends Dto {

    @NotBlank
    private String numero;
    @NotBlank
    private String data;
}

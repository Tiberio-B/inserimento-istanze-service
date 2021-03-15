package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Protocollo;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProtocolloDto extends Dto {

    @NotBlank
    private String numero;
    @NotBlank
    private String data;
}

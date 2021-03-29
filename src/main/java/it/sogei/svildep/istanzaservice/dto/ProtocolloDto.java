package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProtocolloDto extends SvildepDto {

    @NotBlank(message = Messages.numeroProtocollo)
    private String numero;

    @NotBlank(message = Messages.dataProtocollo)
    private String data;
}

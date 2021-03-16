package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class RichiestaDto extends Dto {

    @NotBlank(message = Messages.dataRichiesta)
    private String data;
}

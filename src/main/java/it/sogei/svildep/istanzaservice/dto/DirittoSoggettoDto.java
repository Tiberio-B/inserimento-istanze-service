package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class DirittoSoggettoDto extends Dto {

    @NotEmpty(message = Messages.erroreGenerico)
    private String soggettoId;

    @NotEmpty(message = Messages.erroreGenerico)
    private String tipoDirittoSoggettoId;
}

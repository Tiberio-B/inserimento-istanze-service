package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DepositoDto extends Dto {

    @NotBlank(message = Messages.causaleDeposito)
    private String causale;

    @NotBlank(message = Messages.importoDeposito)
    private String importo;
}

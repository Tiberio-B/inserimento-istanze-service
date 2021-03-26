package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DepositoVolontarioDtoInserimento extends IstanzaDtoInserimento {

    @NotNull(message = Messages.proprietario)
    @Valid
    private DirittoSoggettoDto proprietario;

}

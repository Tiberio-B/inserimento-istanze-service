package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;


import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DepositoCauzionaleDto extends IstanzaDto {

    @Valid
    private SoggettoDto proprietario;

    @Valid
    @NotNull(message = Messages.enteRichiedente)
    private SoggettoDto enteRichiedente;

}

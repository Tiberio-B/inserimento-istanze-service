package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;


import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DepositoCauzionaleDto extends IstanzaDto {

    private SoggettoDto proprietario;

    @NotNull(message = Messages.enteRichiedente)
    private SoggettoDto enteRichiedente;

    public DepositoCauzionaleDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_CAUZIONALE");
        if (getQualitaRichiedente().equals("ME_MEDESIMO")) this.proprietario = getRichiedente();
    }

}

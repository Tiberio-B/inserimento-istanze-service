package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDepCauzionaleInserimentoDto extends IstanzaInserimentoDto {

    @NotNull(message = Messages.proprietario)
    private DirittoSoggettoDto proprietario;

    @NotNull(message = Messages.enteCauzionato)
    private DirittoSoggettoDto enteCauzionato;

}

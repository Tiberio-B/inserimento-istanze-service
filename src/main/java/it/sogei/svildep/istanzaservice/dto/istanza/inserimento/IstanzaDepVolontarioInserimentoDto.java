package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDepVolontarioInserimentoDto extends IstanzaInserimentoDto {

    @NotNull(message = Messages.proprietario)
    @Valid
    private CoinvolgimentoSoggettoDto proprietario;

}

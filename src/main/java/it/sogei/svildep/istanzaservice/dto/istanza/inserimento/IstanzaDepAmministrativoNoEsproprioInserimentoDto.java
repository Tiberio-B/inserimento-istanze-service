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
public class IstanzaDepAmministrativoNoEsproprioInserimentoDto extends IstanzaInserimentoDto {

    @NotNull(message = Messages.versante)
    @Valid
    private CoinvolgimentoSoggettoDto versante;

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private CoinvolgimentoSoggettoDto soggettoUlteriore;

}

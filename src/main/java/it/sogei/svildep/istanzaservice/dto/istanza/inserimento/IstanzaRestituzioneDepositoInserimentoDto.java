package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaRestituzioneDepositoInserimentoDto extends IstanzaInserimentoDto {

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private CoinvolgimentoSoggettoDto intestatario;

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private List<CoinvolgimentoSoggettoDto> soggettiObbligatori;

    @NotBlank(message = Messages.erroreGenerico)
    private String modalitaPagamentoId;

    @NotBlank(message = Messages.erroreGenerico)
    private String pagamentoASoggettiDeposito;

    @NotBlank(message = Messages.erroreGenerico)
    private String importoRichiesto;

}

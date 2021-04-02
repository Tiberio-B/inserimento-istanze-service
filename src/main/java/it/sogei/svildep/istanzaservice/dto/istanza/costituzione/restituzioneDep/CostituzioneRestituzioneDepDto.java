package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ValidSvildepId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneRestituzioneDepDto extends CostituzioneDepositoDto {

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private CoinvolgimentoSoggettoDto intestatario;

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private List<CoinvolgimentoSoggettoDto> soggettiObbligatori;

    @ValidSvildepId
    private String modalitaPagamentoId;

    @NotBlank(message = Messages.erroreGenerico)
    private String pagamentoASoggettiDeposito;

    @NotBlank(message = Messages.erroreGenerico)
    private String importoRichiesto;

}

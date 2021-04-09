package it.sogei.svildep.istanzaservice.dto.istanza.restituzioneDep;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneRestituzioneDepDto extends CostituzioneDepositoDto {

    @NotNull(message = Messages.erroreTipoCoinvolgimento)
    @Valid
    private CoinvolgimentoSoggettoDto intestatario;

    @NotEmpty
    @Valid
    private List<CoinvolgimentoSoggettoDto> soggettiObbligatori;

    @ParsableLong
    private String modalitaPagamentoId;

    @NotBlank(message = Messages.erroreSiNo)
    private String pagamentoASoggettiDeposito;

    @NotBlank(message = Messages.erroreImporto)
    private String importoRichiesto;

}

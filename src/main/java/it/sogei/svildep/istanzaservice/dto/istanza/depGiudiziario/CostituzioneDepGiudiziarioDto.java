package it.sogei.svildep.istanzaservice.dto.istanza.depGiudiziario;

import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagSN;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneDepGiudiziarioDto extends CostituzioneDepositoDto {

    @NotNull
    @Valid
    private SoggettoUlterioreDto soggettoUlteriore;

    @ParsableFlagSN
    private String soggettoNonIdentificato;

}

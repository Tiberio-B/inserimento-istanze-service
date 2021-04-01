package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depGiudiziario;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneDepGiudiziarioDto extends CostituzioneDepositoDto {

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private SoggettoUlterioreDto soggettoUlteriore;

}

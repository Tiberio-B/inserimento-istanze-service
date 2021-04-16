package it.sogei.svildep.dto.istanza.depAmministrativo;

import it.sogei.svildep.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableFlagSN;
import it.sogei.svildep.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneDepAmministrativoDto extends CostituzioneDepositoDto {

    @ParsableLong
    private String operaRegioneId;

    @NotBlank(message = Messages.erroreDescrizioneOpera)
    private String operaDescrizione;

    @NotNull(message = Messages.erroreBeneEspropriato)
    @Valid
    private EsproprioDto beneEspropriato;

    @ParsableFlagSN
    private String autoritaEsproprianteCoincidenteConDepositante;

}

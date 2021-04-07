package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;
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

    @NotBlank(message = Messages.erroreGenerico)
    private String operaDescrizione;

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private BeneEspropriatoDto beneEspropriato;

    @NotBlank(message = Messages.erroreGenerico)
    private String autoritaEsproprianteCoincidenteConDepositante;

    @NotBlank(message = Messages.erroreGenerico)
    private String soggettoDaIndividuare;

}

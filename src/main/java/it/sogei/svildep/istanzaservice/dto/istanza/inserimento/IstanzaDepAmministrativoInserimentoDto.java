package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.BeneEspropriatoDto;
import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDepAmministrativoInserimentoDto extends IstanzaInserimentoDto {

    @NotNull(message = Messages.erroreGenerico)
    @Valid
    private DirittoSoggettoDto depositante;

    @NotNull(message = Messages.proprietario)
    @Valid
    private DirittoSoggettoDto autoritaEspropriante;

    @NotBlank(message = Messages.erroreGenerico)
    private String operaRegioneId;

    @NotBlank(message = Messages.erroreGenerico)
    private String operaDescrizione;

    @NotNull(message = Messages.erroreGenerico)
    private BeneEspropriatoDto beneEspropriato;

    @NotBlank(message = Messages.erroreGenerico)
    private String autoritaEsproprianteCoincidenteConDepositante;

    @NotBlank(message = Messages.erroreGenerico)
    private String soggettoDaIndividuare;

}

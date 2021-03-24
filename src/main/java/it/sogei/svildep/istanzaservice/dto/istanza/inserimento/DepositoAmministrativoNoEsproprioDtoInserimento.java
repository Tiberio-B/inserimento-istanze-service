package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoNoEsproprioDtoInserimento extends InserimentoIstanzaDto {

    @NotNull(message = Messages.versante)
    private SoggettoDto versante;
    @Valid
    private SoggettoDto ulterioreSoggetto;

}

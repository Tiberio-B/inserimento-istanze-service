package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoNoEsproprioDtoInserimento extends InserimentoIstanzaDto {

    @NotBlank(message = Messages.versante)
    private String versanteId;
    @NotBlank(message = Messages.erroreGenerico)
    private String ulterioreSoggettoId;

}

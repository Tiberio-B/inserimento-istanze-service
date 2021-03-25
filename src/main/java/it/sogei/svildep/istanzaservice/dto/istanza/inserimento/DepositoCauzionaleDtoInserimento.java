package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DepositoCauzionaleDtoInserimento extends InserimentoIstanzaDto {

    @NotBlank(message = Messages.proprietario)
    private String proprietarioId;

    @NotBlank(message = Messages.enteCauzionato)
    private String enteCauzionatoId;

}

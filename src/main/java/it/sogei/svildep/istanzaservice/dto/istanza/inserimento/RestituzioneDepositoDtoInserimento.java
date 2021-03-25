package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.dto.pagamento.ModalitaPagamentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RestituzioneDepositoDtoInserimento extends InserimentoIstanzaDto {

    private String importoRichiesto;

    @NotEmpty(message = Messages.erroreGenerico)
    private List<SoggettoDto> soggettiObbligatori;

    @NotBlank(message = Messages.erroreGenerico)
    private String intestatarioId;

    private String pagamentoASoggettiDeposito;

    private String modalitaPagamentoId;

}

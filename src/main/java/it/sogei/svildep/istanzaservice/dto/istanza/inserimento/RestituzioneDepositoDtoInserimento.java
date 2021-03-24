package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.dto.pagamento.ModalitaPagamentoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RestituzioneDepositoDtoInserimento extends InserimentoIstanzaDto {

    private String importoRichiesto;

    @Valid
    private List<SoggettoDto> soggettiObbligatori;
    @Valid
    private SoggettoDto intestatario;

    private String pagamentoASoggettiDeposito;

    private ModalitaPagamentoDto modalitaPagamento;

}

package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DettaglioIstanzaRestituzioneDepositoDto extends DettaglioIstanzaDepositoDto{

    private String categoriaDeposito;
    private String dataDomandaCostituzioneDeposito;
    private String numeroDeposito;
    private String importoDeposito;
    private List<SoggettoFisicoDto> listaSoggettiFisiciObbligatori;
    private List<SoggettoGiuridicoDto> listaSoggettiGiuridiciObbligatori;
    private List<DittaIndividualeDto> listaDitteIndividualiObbligatorie;
    private String pagamentoIntestatario;
    private String cfIntestatario;
    private String nominativoIntestatario;
    private ModalitaPagamentoDto modalitaPagamento;
    private SvincoloReintroitoDto svincoloReintroito;

}

package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DittaIndividualeDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoGiuridicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.pagamento.ModalitaPagamentoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IstanzaRestituzioneDepositoDto extends IstanzaDepositoDto {

    private String categoriaDeposito;
    private String dataDomandaCostituzioneDeposito;
    private String numeroDeposito;
    private String importoDeposito;
    private List<SoggettoFisicoRicercaDto> listaSoggettiFisiciObbligatori;
    private List<SoggettoGiuridicoRicercaDto> listaSoggettiGiuridiciObbligatori;
    private List<DittaIndividualeDto> listaDitteIndividualiObbligatorie;
    private String pagamentoIntestatario;
    private String cfIntestatario;
    private String nominativoIntestatario;
    private ModalitaPagamentoDto modalitaPagamento;
    private IstanzaSvincoloReintroitoDto svincoloReintroito;

}

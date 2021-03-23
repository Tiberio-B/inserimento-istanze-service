package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DettaglioIstanzaDepositoDto {

    private String numeroRichiesta;
    private String dataRichiesta;
    private String modalitaTrasmissione;
    private String numeroProtocollo;
    private String dataProtocollo;
    private String statoRichiesta;
    private String rtsInoltro;
    private String rtsCompetente;
    private String qualitaRichiedente;
    private String causaleDeposito;
    private String importoDeposito;
    private SoggettoFisicoDto richiedente;
}

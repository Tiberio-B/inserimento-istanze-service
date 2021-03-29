package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class IstanzaDepositoDto extends SvildepDto {

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
    private SoggettoFisicoRicercaDto richiedente;
}

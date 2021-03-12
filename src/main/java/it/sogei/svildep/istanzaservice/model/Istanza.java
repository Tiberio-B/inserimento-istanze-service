package it.sogei.svildep.istanzaservice.model;

import it.sogei.svildep.istanzaservice.model.pagamento.ModalitaPagamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
public class Istanza implements Entity {

    private Long id;

    private QualitaRichiedente qualitaRichiedente;
    private Categoria categoriaDeposito;
    private Stato stato = Stato.IN_BOZZA;

    private Soggetto richiedente;
    private Deposito datiDeposito;

    private Richiesta datiRichiesta;
    private Protocollo datiProtocollo;

    private Rts rtsInoltro;
    private Set<Documento> allegati;

    ///// Deposito Amministrativo

    private Soggetto depositante;
    private Soggetto autoritaEspropriante;

    private Opera datiOpera;
    private Bene beneEspropriato;

    ///// Deposito Amministrativo No Esproprio

    private Soggetto versante; // anche Giudiziario
    private Soggetto soggettoUlteriore; // anche Giudiziario

    ///// Deposito Cauzionale

    private Soggetto proprietario; // anche Volontario
    private Soggetto enteRichiedente;

    ///// Deposito Giudiziario

    private Soggetto autoritaOrdinante;

    ///// Restituzione Deposito

    private BigDecimal importoRichiesto;

    private Set<Soggetto> soggettiObbligatori;
    private Soggetto intestatario;

    private Boolean pagamentoASoggettiDeposito;

    private ModalitaPagamento modalitaPagamento;

    public enum Categoria {

        DEPOSITO_CAUZIONALE,
        DEPOSITO_GIUDIZIARIO,
        DEPOSITO_AMMINISTRATIVO,
        DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO,
        DEPOSITO_VOLONTARIO,
        DECRETO_SVINCOLO_REINTROITO,
        RESTITUZIONE_DEPOSITO;
    }

    public enum Stato {

        IN_BOZZA;
    }

    public enum QualitaRichiedente {

        ME_MEDESIMO,
        TITOLARE_RAPPRESENTANTE_LEGALE,
        RESPONSABILE_UFFICIO_PUBBLICO;
    }
}

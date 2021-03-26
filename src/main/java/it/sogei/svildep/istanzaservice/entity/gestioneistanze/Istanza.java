package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento.ModalitaPagamento;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Istanza extends BaseEntity {

    private Long id;
    private Long numeroRichiesta;
    private LocalDate dataRichiesta;
    private Long numeroProtocollo;
    private LocalDate dataProtocollo;
    private String codicePagoPA;
    private Long importoDeposito;
    private String causaleDeposito;
    private String datProcedimentoTribunale;
    private Double importoRestituzioneDeopsito;
    private String motivazioneInvioDST;
    private Deposito deposito;
    private DatoCatastale datoCatastale;
    private CategoriaDeposito categoriaDeposito;
    private TipoIstanza tipo;
    private DirittoSoggetto richiedente;
    private DirittoSoggetto proprietario;
    private DirittoSoggetto altroProprietario;
    private DirittoSoggetto enteCauzionato;
    private DirittoSoggetto depositanteLegale;
    private DirittoSoggetto espropriante;
    private DirittoSoggetto proprietarioEntePubblico;
    private DirittoSoggetto erede;
    private ModalitaPagamento modalitaPagamento;
    private StatoIstanza stato;
    //TODO: serve il mandato? SI
}

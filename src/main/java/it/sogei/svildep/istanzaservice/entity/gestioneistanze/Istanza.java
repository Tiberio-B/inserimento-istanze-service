package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
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
    private Double importoDeposito;
    private String causaleDeposito;
    private String datProcedimentoTribunale;
    private Double importoRestituzioneDeopsito;
    private String motivazioneInvioDST;
    private Deposito deposito;
    private DatoCatastale datoCatastale;
    private CategoriaDeposito categoriaDeposito;
    private TipoIstanza tipo;
    private CoinvolgimentoSoggetto richiedente;
    private CoinvolgimentoSoggetto proprietario;
    private CoinvolgimentoSoggetto altroProprietario;
    private CoinvolgimentoSoggetto enteCauzionato;
    private CoinvolgimentoSoggetto depositanteLegale;
    private CoinvolgimentoSoggetto espropriante;
    private CoinvolgimentoSoggetto proprietarioEntePubblico;
    private CoinvolgimentoSoggetto erede;
    private ModalitaPagamento modalitaPagamento;
    private StatoIstanza stato;
    private Opera opera;
    private BeneEsprorpiato beneEspropriato;
    private FlagSN inserimentoManuale;
    //TODO: serve il mandato? SI
}

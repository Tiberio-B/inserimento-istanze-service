package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento.ModalitaPagamento;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.RTS;
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

    private Double importoDeposito;
    private String causaleDeposito;

    private String datiProcedimentoTribunale;
    private Double importoRestituzioneDeposito;
    private String motivazioneInvioDST;

    private Deposito deposito;
    private DatoCatastale datoCatastale;

    private CategoriaDeposito categoriaDeposito;

    private TipoIstanza tipo;

    private StatoIstanza stato;

    private ModalitaPagamento modalitaPagamento;

    private RTS rtsInoltro;

    private RTS rtsCompetente;

    private BeneEsprorpiato beneEspropriato;

    private QualitaRichiedente qualitaRichiedente;

    private Opera opera;

    private FlagSN inserimentoManuale;
}

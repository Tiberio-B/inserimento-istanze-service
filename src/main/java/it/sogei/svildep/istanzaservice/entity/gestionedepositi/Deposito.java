package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagBC;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.RTS;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Deposito extends BaseEntity {

    private Long id;
    private LocalDate dataAperturaDeposito;
    private Double importoIniziale;
    private Long numeroNazionale;
    private Long numeroLocale;
    private FlagBC flagSpecieBC;
    private Double importoInteressiAnte2001;
    private FlagSN flagVerificaAnte2001SN;
    private FlagSN flagIscrizioneSN;
    private FlagSN flagFruttiferoSN;
    private FlagSN flagInteressiPeriodiciSN;
    private FlagSN flagBolliSN;
    private FlagSN flagMarcheDaBolloSN;
    private FlagSN flagEsproprioSN;
    private String note;
    private Long idDepositoOld;
    private Long idPagoPA;
    private LocalDate dataPerfezionamento;
    private Double importoVersamento;
    private String numeroLibretto;
    private String numeroRegistro;
    private String numeroFascicolo;
    private String nominativoBeneficiario;
    private Versante versante;
    private DatoCatastale datoCatastale;
    private Deposito depositoCollegato;
    private StatoDeposito statoDeposito;
    private CategoriaDeposito categoriaDeposito;
    private RTS rtsCostituzione;
    private RTS rtsCompetente;
}

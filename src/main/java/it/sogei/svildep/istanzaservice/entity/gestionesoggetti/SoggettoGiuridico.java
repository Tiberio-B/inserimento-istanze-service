package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SoggettoGiuridico extends BaseEntity {

    private Long idSoggettoGiuridico;
    private String ragioneSociale;
    private String CCIAA;
    private String partitaIVA;
    private String denominazioneDitta;
    private Soggetto soggetto;
    private NaturaGiuridica naturaGiuridica;
    private TipoUnita tipoUnita;
}

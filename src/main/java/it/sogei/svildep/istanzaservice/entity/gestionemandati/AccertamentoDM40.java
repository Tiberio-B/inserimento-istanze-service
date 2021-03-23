package it.sogei.svildep.istanzaservice.entity.gestionemandati;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class AccertamentoDM40 extends BaseEntity {

    private Long idAccertamentoDM40;
    private LocalDate dataAccertamento;
    private String codiceFiscaleSoggetto;
    private Long importoInadempienza;
    private String noteIntegrative;
    private Long idPignoramento;
    private FlagSN flagLiberatoriaInadempienzaSN;
    private FlagSN flagNotificaSN;
    private LocalDate dataNotificaPignoramento;
    private Long idSoggettoPignorante;
    private Double importoAccertamentoNotificato;
    private String noteIntegrativeNotifica;
    private TipoAccertamentoDM40 tipoAccertamentoDM40;
}

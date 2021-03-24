package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagCA;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class NaturaGiuridica extends BaseEntity {

    private Long id;
    private LocalDate dataInizioValidita;
    private LocalDate dataFineValidita;
    private String denominazioneNaturaGiuridica;
    private FlagCA flagChiusuraCA;
}

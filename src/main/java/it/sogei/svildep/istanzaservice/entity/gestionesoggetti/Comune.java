package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Comune extends BaseEntity {

    private Long idComune;
    private String sigla;
    private String denominazioneComune;
    private LocalDate dataInizioValidita;
    private LocalDate dataFineValidita;
    private String comune;
    private Provincia provincia;
}

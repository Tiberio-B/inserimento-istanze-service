package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSessoMF;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SoggettoFisico extends Soggetto {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private Comune comuneNascita;
    private StatoEstero statoEsteroNascita;
    private FlagSessoMF sesso;
    private Soggetto soggetto;
    private SoggettoGiuridico soggettoGiuridico;
}
package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QualitaRichiedente {

    private Long id;
    private FlagQualitaRichiedente sigla;
    private String descrizione;

    public enum FlagQualitaRichiedente {

        ME_MEDESIMO,
        TITOLARE_RAPPRESENTANTE_LEGALE,
        RESPONSABILE_UFFICIO_PUBBLICO;
    }
}

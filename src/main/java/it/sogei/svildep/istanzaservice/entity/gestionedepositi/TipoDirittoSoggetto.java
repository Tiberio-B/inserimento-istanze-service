package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoDirittoSoggetto;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class TipoDirittoSoggetto extends BaseEntity {

    private Long id;
    private FlagTipoDirittoSoggetto descrizioneTipoDirittoSoggetto;
}

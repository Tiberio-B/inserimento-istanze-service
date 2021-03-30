package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoCoinvolgimentoSoggetto;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class TipoCoinvolgimentoSoggetto extends BaseEntity {

    private Long id;
    private FlagTipoCoinvolgimentoSoggetto descrizioneTipoDirittoSoggetto;
}

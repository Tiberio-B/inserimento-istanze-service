package it.sogei.svildep.istanzaservice.entity;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.TipoDirittoSoggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DirittoSoggetto extends BaseEntity {

    private Long id;
    private Long soggettoId;
    private Long depositoId;
    private TipoDirittoSoggetto tipoDirittoSoggetto;
}

package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSoggetto;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoSoggetto  extends BaseEntity {

    private Long id;
    private FlagTipoSoggetto descrizioneTipoSoggetto;
}

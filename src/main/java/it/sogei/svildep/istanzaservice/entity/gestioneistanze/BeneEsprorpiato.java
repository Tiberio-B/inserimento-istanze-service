package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeneEsprorpiato extends BaseEntity {

    private Long id;
    private DatoCatastale datiCatastali;
    private ProprietarioCatastale proprietarioCatastale;
}

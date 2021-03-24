package it.sogei.svildep.istanzaservice.entity.gestionemandati;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Svincolo extends BaseEntity {

    private Long id;
    private Long numeroProtocollo;
    private LocalDate dataSvincolo;
    private String enteSvincolante;
    private TipoEnteSvincolante tipoEnteSvincolante;
}

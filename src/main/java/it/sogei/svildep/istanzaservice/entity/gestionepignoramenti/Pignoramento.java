package it.sogei.svildep.istanzaservice.entity.gestionepignoramenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Pignoramento extends BaseEntity {

    private Long id;
    private LocalDate dataNotificaPignoramento;
}

package it.sogei.svildep.istanzaservice.entity.gestionepignoramenti;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Pignoramento extends BaseEntity {

    private Long idPignoramento;
    private LocalDate dataNotificaPignoramento;
}

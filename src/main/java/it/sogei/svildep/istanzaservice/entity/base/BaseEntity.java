package it.sogei.svildep.istanzaservice.entity.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public abstract class BaseEntity {

    public abstract Long getId();

    public abstract void setId(Long id);

    private Long idUtenteInserimento;

    private LocalDateTime timestampInserimento;

    private Long idUtenteAggiornamento;

    private LocalDateTime timestampAggiornamento;

}

package it.sogei.svildep.istanzaservice.entity.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter @Setter
public abstract class BaseEntity implements Serializable {

    public abstract Long getId();

    public abstract void setId(Long id);

    private Long idUtenteInserimento;

    private LocalDateTime timestampInserimento;

    private Long idUtenteAggiornamento;

    private LocalDateTime timestampAggiornamento;

}

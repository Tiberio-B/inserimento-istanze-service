package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SoggettoRicercaDto extends SvildepDto {

    private String codiceFiscale;

}

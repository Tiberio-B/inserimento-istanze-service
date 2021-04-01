package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RicercaSoggettoDto extends SvildepDto {

    private String codiceFiscale;

}

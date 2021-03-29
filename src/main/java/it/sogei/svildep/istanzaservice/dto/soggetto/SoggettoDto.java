package it.sogei.svildep.istanzaservice.dto.soggetto;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class SoggettoDto extends SvildepDto {

    private String codiceFiscale;
    private String certificatoAnagrafeTributaria;
    private String tipoSoggetto;
    private String nonIdentificato;
    private List<IndirizzoDto> indirizzi;

}

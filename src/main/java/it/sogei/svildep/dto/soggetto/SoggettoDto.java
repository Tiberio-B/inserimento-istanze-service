package it.sogei.svildep.dto.soggetto;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.dto.geo.IndirizzoDto;
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

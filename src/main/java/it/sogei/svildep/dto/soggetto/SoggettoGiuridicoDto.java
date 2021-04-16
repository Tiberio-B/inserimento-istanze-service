package it.sogei.svildep.dto.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoGiuridicoDto extends SoggettoDto {

    private String ragioneSociale;
    private String partitaIva;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSede;

}


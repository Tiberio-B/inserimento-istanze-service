package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RicercaSoggettoGiuridicoDto extends RicercaSoggettoDto {

    private String ragioneSociale;
    private String partitaIva;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSede;

}


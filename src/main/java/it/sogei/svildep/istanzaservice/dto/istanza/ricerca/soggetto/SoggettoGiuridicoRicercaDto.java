package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoGiuridicoRicercaDto extends SoggettoRicercaDto {

    private String ragioneSociale;
    private String partitaIva;
    private String progressivoSedeDa;
    private String progressivoSedeA;
    private String tipoSede;

}


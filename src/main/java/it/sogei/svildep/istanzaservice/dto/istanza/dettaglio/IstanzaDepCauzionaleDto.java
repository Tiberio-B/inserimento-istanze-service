package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DittaIndividualeDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoGiuridicoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepCauzionaleDto extends IstanzaDepositoDto {

    private String codicePagoPaBollo;
    private SoggettoFisicoRicercaDto proprietarioFisico;
    private SoggettoGiuridicoRicercaDto proprietarioGiuridico;
    private DittaIndividualeDto proprietarioDitta;
    private SoggettoGiuridicoRicercaDto enteRichiedente;


}

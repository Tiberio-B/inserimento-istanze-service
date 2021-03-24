package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaDepCauzionaleDto extends DettaglioIstanzaDepositoDto{

    private String codicePagoPaBollo;
    private SoggettoFisicoDto proprietarioFisico;
    private SoggettoGiuridicoDto proprietarioGiuridico;
    private DittaIndividualeDto proprietarioDitta;
    private SoggettoGiuridicoDto enteRichiedente;


}

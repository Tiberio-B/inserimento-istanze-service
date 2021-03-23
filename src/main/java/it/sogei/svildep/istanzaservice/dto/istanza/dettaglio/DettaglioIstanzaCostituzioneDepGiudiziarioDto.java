package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostituzioneDepGiudiziarioDto extends DettaglioIstanzaDepositoDto{

    private SoggettoFisicoDto versanteFisico;
    private SoggettoGiuridicoDto versanteGiuridico;
    private DittaIndividualeDto versanteDitta;
    private SoggettoGiuridicoDto autoritaOrdinante;
    private SoggettoFisicoDto soggettoUlteriore;
}

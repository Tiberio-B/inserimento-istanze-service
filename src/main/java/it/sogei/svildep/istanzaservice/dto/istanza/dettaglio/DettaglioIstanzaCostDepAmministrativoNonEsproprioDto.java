package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostDepAmministrativoNonEsproprioDto extends DettaglioIstanzaDepositoDto{

    private SoggettoFisicoDto versanteFisico;
    private SoggettoGiuridicoDto versanteGiuridico;
    private DittaIndividualeDto versanteDitta;
    private SoggettoFisicoDto soggettoUlterioreFisico;
    private SoggettoGiuridicoDto soggettoUlterioreGiuridico;

}

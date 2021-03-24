package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
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

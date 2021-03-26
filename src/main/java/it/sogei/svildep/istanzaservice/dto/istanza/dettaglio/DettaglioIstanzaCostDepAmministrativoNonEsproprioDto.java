package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostDepAmministrativoNonEsproprioDto extends DettaglioIstanzaDepositoDto{

    private DirittoSoggettoDto versanteFisico;
    private DirittoSoggettoDto versanteGiuridico;
    private DirittoSoggettoDto versanteDitta;
    private DirittoSoggettoDto soggettoUlterioreFisico;
    private DirittoSoggettoDto soggettoUlterioreGiuridico;

}

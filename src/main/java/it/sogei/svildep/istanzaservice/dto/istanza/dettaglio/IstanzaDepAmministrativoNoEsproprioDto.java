package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepAmministrativoNoEsproprioDto extends IstanzaDepositoDto {

    private CoinvolgimentoSoggettoDto versanteFisico;
    private CoinvolgimentoSoggettoDto versanteGiuridico;
    private CoinvolgimentoSoggettoDto versanteDitta;
    private CoinvolgimentoSoggettoDto soggettoUlterioreFisico;
    private CoinvolgimentoSoggettoDto soggettoUlterioreGiuridico;

}

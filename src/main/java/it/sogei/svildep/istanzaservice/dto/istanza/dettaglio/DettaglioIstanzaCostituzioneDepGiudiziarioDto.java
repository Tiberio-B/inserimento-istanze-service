package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostituzioneDepGiudiziarioDto extends DettaglioIstanzaDepositoDto{

    private DirittoSoggettoDto versanteFisico;
    private DirittoSoggettoDto versanteGiuridico;
    private DirittoSoggettoDto versanteDitta;
    private SoggettoGiuridicoDto autoritaOrdinante;
    private SoggettoFisicoDto soggettoUlteriore;
}

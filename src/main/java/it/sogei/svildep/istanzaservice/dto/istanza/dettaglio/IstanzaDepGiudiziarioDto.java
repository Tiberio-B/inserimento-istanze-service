package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoGiuridicoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepGiudiziarioDto extends IstanzaDepositoDto {

    private CoinvolgimentoSoggettoDto versanteFisico;
    private CoinvolgimentoSoggettoDto versanteGiuridico;
    private CoinvolgimentoSoggettoDto versanteDitta;
    private SoggettoGiuridicoRicercaDto autoritaOrdinante;
    private SoggettoFisicoRicercaDto soggettoUlteriore;
}

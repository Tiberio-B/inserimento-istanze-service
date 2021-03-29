package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoGiuridicoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepGiudiziarioDto extends IstanzaDepositoDto {

    private DirittoSoggettoDto versanteFisico;
    private DirittoSoggettoDto versanteGiuridico;
    private DirittoSoggettoDto versanteDitta;
    private SoggettoGiuridicoRicercaDto autoritaOrdinante;
    private SoggettoFisicoRicercaDto soggettoUlteriore;
}

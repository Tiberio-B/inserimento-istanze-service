package it.sogei.svildep.istanzaservice.dto.istanza.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoRicercaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class IstanzaRicercaDto<S extends SoggettoRicercaDto> extends IstanzaDto {

    private String modalitaTrasmissione;

    private String dataDa;
    private String dataA;

    private String idStato;
    private String numeroRichiestaPadre;

    private String numeroDepositoNazionaleDa;
    private String numeroDepositoNazionaleA;

    private String esproprio;
    private String conMandatoRestituzione;

    private S soggettoDto;

}

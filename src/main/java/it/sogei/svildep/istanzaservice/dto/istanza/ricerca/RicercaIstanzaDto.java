package it.sogei.svildep.istanzaservice.dto.istanza.ricerca;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RicercaIstanzaDto {

    private String dataIstanzaDa;
    private String dataIstanzaA;
    private Long idTipoIstanza;
    private Long idStatoRichiesta;
    private Long numeroDepositoNazionaleDa;
    private Long numeroDepositoNazionaleA;
    private String esproprio;
    private String modalitaTrasmissione;
    private Long idenRichiestPadre;
    private String presMandatoRestituzione;
    @NotNull(message = Messages.tipoSoggetto)
    private Long idTipoSoggetto;
    private RicercaSoggettoDto soggetto;

}

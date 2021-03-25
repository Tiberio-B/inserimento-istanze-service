package it.sogei.svildep.istanzaservice.dto.istanza.ricerca;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListaRicercaIstanzaDto extends Dto {

    private String dataIstanza;
    private String idTipoIstanza;
    private String idNumeroIstanza;
    private String modalitaTrasmissione;
    private String idenRichiestPadre;
    private String idRtsRicevente;
    private String idRtsCompetente;
    private String idStatoRichiesta;
    private String categoriaDeposito;
    private String numeroNazionaleDeposito;
    private String qualitaRichiedente;
    private String nominativoRichiedente;
    private String cf;
    private String numeroMandatoRestituzione;

}
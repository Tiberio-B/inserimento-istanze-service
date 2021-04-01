package it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza;

import it.sogei.svildep.istanzaservice.dto.RtsDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaTrovataDto extends IstanzaDto {

    private String modalitaTrasmissione;

    private RtsDto rtsRicevente;
    private RtsDto rtsCompetente;

    private String numeroRichiestPadre;
    private String numeroNazionaleDeposito;
    private String numeroMandatoRestituzione;

}

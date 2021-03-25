package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoGiuridicoDto extends SoggettoDto {


    private String ragioneSociale;
    private String naturaGiuridicaId;
    private String partitaIva;
    private String CCIAA;
    private String progressivoSede;
    private String tipoSede;
    private String denominazioneDitta;


}


package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoDtoInserimento extends InserimentoIstanzaDto {

    @Valid
    private SoggettoGiuridicoDto depositante;
    @Valid
    private SoggettoGiuridicoDto autoritaEspropriante;

    private String autoritaEsproprianteCoincidenteConDepositante;

    private String soggettoDaIndividuare;

    @Valid
    private OperaDto datiOpera;
    @Valid
    private BeneDto beneEspropriato;
}

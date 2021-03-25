package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoDtoInserimento extends InserimentoIstanzaDto {

    @NotBlank(message = Messages.erroreGenerico)
    private String depositanteId;
    @NotBlank(message = Messages.erroreGenerico)
    private String autoritaEsproprianteId;

    @NotBlank(message = Messages.erroreGenerico)
    private String autoritaEsproprianteCoincidenteConDepositante;

    @NotBlank(message = Messages.erroreGenerico)
    private String soggettoDaIndividuare;

    @NotBlank(message = Messages.erroreGenerico)
    private String operaId;

    @NotBlank(message = Messages.erroreGenerico)
    private String beneEspropriatoId;
}

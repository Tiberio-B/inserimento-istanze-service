package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class BeneEspropriatoDto extends SvildepDto {

    @NotNull(message = Messages.datiCatastali)
    @Valid
    private DatoCatastaleDto datiCatastali;

    @NotEmpty(message = Messages.proprietariCatastali)
    private List<ProprietarioCatastaleDto> proprietariCatastali;
}

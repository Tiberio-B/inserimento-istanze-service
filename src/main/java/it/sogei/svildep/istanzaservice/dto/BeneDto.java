package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class BeneDto extends Dto {

    @NotNull(message = Messages.datiCatastali)
    @Valid
    private CatastoDto datiCatastali;

    @NotEmpty(message = Messages.proprietariCatastali)
    private List<String> proprietariCatastaliIds;
}

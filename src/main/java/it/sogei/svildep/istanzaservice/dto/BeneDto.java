package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
public class BeneDto extends Dto {

    @NotNull
    private CatastoDto datiCatastali;
    @NotEmpty
    private Set<SoggettoDto> proprietariCatastali;
}

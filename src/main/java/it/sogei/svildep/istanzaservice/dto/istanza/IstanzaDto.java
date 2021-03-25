package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends Dto {

    @NotBlank(message = Messages.erroreGenerico)
    private String statoId;
    @NotBlank(message = Messages.erroreGenerico)
    private String tipoId;

}

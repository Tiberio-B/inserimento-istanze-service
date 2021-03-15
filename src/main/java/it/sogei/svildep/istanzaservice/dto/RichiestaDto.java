package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class RichiestaDto extends Dto {

    @NotBlank
    private String data;
}

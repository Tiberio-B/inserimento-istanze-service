package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.geo.ComuneDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CatastoDto extends Dto {

    @NotBlank
    private String tipo;
    @NotBlank
    private String sezioneUrbana;
    @NotBlank
    private String foglio;
    @NotBlank
    private String subalterno;
    @NotBlank
    private String particella;
    @NotBlank
    private String provincia;
    @NotNull
    private ComuneDto comune;
}

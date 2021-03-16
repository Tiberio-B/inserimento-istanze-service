package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.geo.ComuneDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CatastoDto extends Dto {

    @NotBlank(message = Messages.tipoCatasto)
    private String tipo;

    @NotBlank(message = Messages.sezioneUrbana)
    private String sezioneUrbana;

    @NotBlank(message = Messages.foglioCatasto)
    private String foglio;

    @NotBlank(message = Messages.subalternoCatasto)
    private String subalterno;

    @NotBlank(message = Messages.particellaCatasto)
    private String particella;

    @NotBlank(message = Messages.provincia)
    private String provincia;

    @NotNull(message = Messages.comune)
    private ComuneDto comune;
}

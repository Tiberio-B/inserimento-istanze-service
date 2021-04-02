package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ValidSvildepId;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DatoCatastaleDto extends SvildepDto {

    @ValidSvildepId(message = Messages.tipoCatasto)
    private String tipoCatastoId;

    @NotBlank(message = Messages.sezioneUrbana)
    private String sezioneUrbana;

    @NotBlank(message = Messages.foglioCatasto)
    private String foglio;

    @NotBlank(message = Messages.subalternoCatasto)
    private String subalterno;

    @NotBlank(message = Messages.particellaCatasto)
    private String particella;

    @ValidSvildepId(message = Messages.comune)
    private String comuneId;
}

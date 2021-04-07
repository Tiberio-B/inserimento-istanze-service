package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DatoCatastaleDto extends SvildepDto {

    @ParsableLong(message = Messages.tipoCatasto)
    private String tipoCatastoId;

    @NotBlank(message = Messages.sezioneUrbana)
    private String sezioneUrbana;

    @NotBlank(message = Messages.foglioCatasto)
    private String foglio;

    @NotBlank(message = Messages.subalternoCatasto)
    private String subalterno;

    @NotBlank(message = Messages.particellaCatasto)
    private String particella;

    @ParsableLong(message = Messages.comune)
    private String comuneId;
}

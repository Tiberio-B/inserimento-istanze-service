package it.sogei.svildep.dto.istanza.depAmministrativo;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class EsproprioDto extends SvildepDto {

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

    @NotEmpty(message = Messages.proprietariCatastali)
    @Valid
    private List<ProprietarioCatastaleDto> proprietariCatastali;
}

package it.sogei.svildep.dto.istanza.depAmministrativo;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class OperaDto extends SvildepDto {

    @NotBlank(message = Messages.descrizioneOpera)
    private String descrizione;

    @ParsableLong
    private String regioneId;
}

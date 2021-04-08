package it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;
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

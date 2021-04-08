package it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagSN;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProprietarioCatastaleDto extends SvildepDto {

    @NotBlank(message = Messages.erroreGenerico)
    private String nominativo;

    @NotBlank(message = Messages.erroreGenerico)
    private String cfPiva;

    @ParsableFlagSN
    private String soggettoIrreperibile;

    private byte[] documentoRelataNotifica;


}

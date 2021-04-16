package it.sogei.svildep.dto.istanza.depAmministrativo;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableFlagSN;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProprietarioCatastaleDto extends SvildepDto {

    @NotBlank(message = Messages.erroreNome)
    private String nominativo;

    @NotBlank(message = Messages.erroreCfPiva)
    private String cfPiva;

    @ParsableFlagSN
    private String soggettoIrreperibile;

    private byte[] documentoRelataNotifica;


}

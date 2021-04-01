package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProprietarioCatastaleDto extends SvildepDto {

    private String nominativo;
    private String cfPiva;
    private String soggettoIrreperibile;
    private byte[] documentoRelataNotifica;


}

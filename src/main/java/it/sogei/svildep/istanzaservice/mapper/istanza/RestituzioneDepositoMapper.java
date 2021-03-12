package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.RestituzioneDeposito;
import org.springframework.stereotype.Component;

@Component
public class RestituzioneDepositoMapper extends IstanzaMapper<RestituzioneDeposito, RestituzioneDepositoDto> {

    @Override
    public RestituzioneDepositoDto convertEntityToDtoImpl(RestituzioneDeposito entity) {
        return super.mapIstanzaEntityToDto(entity, new RestituzioneDepositoDto());
    }

    @Override
    public RestituzioneDeposito convertDtoToEntityImpl(RestituzioneDepositoDto dto) throws SvildepException {
        return super.mapIstanzaDtoToEntity(dto, new RestituzioneDeposito());
    }
}

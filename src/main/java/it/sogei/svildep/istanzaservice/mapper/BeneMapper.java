package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeneMapper implements Mapper<Bene, BeneDto> {

    private final SoggettoMapper soggettoMapper;
    private final CatastoMapper catastoMapper;

    @Override
    public BeneDto mapEntityToDtoImpl(Bene entity) {
        BeneDto dto = new BeneDto();
        dto.setDatiCatastali(catastoMapper.mapEntityToDto(entity.getDatiCatastali()));
        dto.setProprietariCatastali(soggettoMapper.mapEntityToDto(entity.getProprietariCatastali()));
        return dto;
    }

    @Override
    public Bene mapDtoToEntityImpl(BeneDto dto) throws SvildepException {
        Bene entity = new Bene();
        entity.setDatiCatastali(catastoMapper.mapDtoToEntity(dto.getDatiCatastali()));
        entity.setProprietariCatastali(soggettoMapper.mapDtoToEntity(dto.getProprietariCatastali()));
        return entity;
    }
}

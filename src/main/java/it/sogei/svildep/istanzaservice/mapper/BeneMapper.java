package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Bene;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeneMapper implements Mapper<Bene, BeneDto> {

    private final SoggettoMapper soggettoMapper;
    private final CatastoMapper catastoMapper;

    @Override
    public BeneDto convertEntityToDtoImpl(Bene entity) {
        BeneDto dto = new BeneDto();
        dto.setDatiCatastali(catastoMapper.convertEntityToDto(entity.getDatiCatastali()));
        dto.setProprietariCatastali(soggettoMapper.convertEntityToDto(entity.getProprietariCatastali()));
        return dto;
    }

    @Override
    public Bene convertDtoToEntityImpl(BeneDto dto) throws SvildepException {
        Bene entity = new Bene();
        entity.setDatiCatastali(catastoMapper.convertDtoToEntity(dto.getDatiCatastali()));
        entity.setProprietariCatastali(soggettoMapper.convertDtoToEntity(dto.getProprietariCatastali()));
        return entity;
    }
}

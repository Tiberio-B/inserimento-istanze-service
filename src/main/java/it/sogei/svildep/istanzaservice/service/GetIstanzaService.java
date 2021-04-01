package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetIstanzaService extends IstanzaService {

    private final IstanzaMapper istanzaMapper;

    public List<IstanzaDto> getAll() {
        return istanzaMapper.mapEntityToDto(getPersistenceService().getAllIstanze());
    }

    public IstanzaDto get(Long id) {
        return istanzaMapper.mapEntityToDto(getPersistenceService().getIstanza(id));
    }

}

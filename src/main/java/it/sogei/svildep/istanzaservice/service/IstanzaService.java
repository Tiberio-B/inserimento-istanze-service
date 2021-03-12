package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.IstanzaMapper;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class IstanzaService {

    private final SoggettoService soggettoService;
    private final RtsService rtsService;
    private final IstanzaRepository repository;
    private final IstanzaMapper mapper;

    public void prepareInsert(IstanzaDto istanza) throws SvildepException {
        MessageDto soggettoResponse = soggettoService.verificaSoggettiMock(istanza.getRichiedente());
        if (soggettoResponse.isError()) throw new SvildepException(soggettoResponse);

        MessageDto rtsResponse = rtsService.inserimentoInFascicoloMock(istanza.getAllegati());
        if (rtsResponse.isError()) throw new SvildepException(rtsResponse);
    }

    public IstanzaDto get(Long id) { return mapper.convertEntityToDto(repository.get(id)); }

    public List<IstanzaDto> getAll() { return mapper.convertEntityToDto(repository.getAll()); }

    public IstanzaDto insert(IstanzaDto dto) throws SvildepException { return mapper.convertEntityToDto(repository.insert(mapper.convertDtoToEntity(dto))); }

    public boolean update(IstanzaDto dto) throws SvildepException { return repository.update(mapper.convertDtoToEntity(dto)); }

    public IstanzaDto delete(Long id) { return mapper.convertEntityToDto(repository.delete(id)); }

    public void drop() { repository.drop(); }
}

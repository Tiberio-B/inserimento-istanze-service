package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@NoArgsConstructor
public abstract class IstanzaService<I extends Istanza, D extends IstanzaDto> {

    @Autowired private SoggettoService soggettoService;
    @Autowired private RtsService rtsService;
    @Autowired private IstanzaRepository<I> repository;
    @Autowired private Mapper<I, D> mapper;

    public void prepareInsert(IstanzaDto istanza) throws SvildepException {
        MessageDto soggettoResponse = soggettoService.verificaSoggettiMock(istanza.getRichiedente());
        if (soggettoResponse.isError()) throw new SvildepException(soggettoResponse);

        MessageDto rtsResponse = rtsService.inserimentoInFascicoloMock(istanza.getAllegati());
        if (rtsResponse.isError()) throw new SvildepException(rtsResponse);
    }

    public D get(Long id) { return mapper.convertEntityToDto(repository.get(id)); }

    public List<D> getAll() { return mapper.convertEntityToDto(repository.getAll()); }

    public D insert(D dto) throws SvildepException { return mapper.convertEntityToDto(repository.insert(mapper.convertDtoToEntity(dto))); }

    public boolean update(D dto) throws SvildepException { return repository.update(mapper.convertDtoToEntity(dto)); }

    public D delete(Long id) { return mapper.convertEntityToDto(repository.delete(id)); }

    public void drop() { repository.drop(); }
}

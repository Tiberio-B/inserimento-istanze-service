package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.Istanza;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@NoArgsConstructor
public abstract class IstanzaService<D extends IstanzaDto> {

    @Autowired private SoggettoService soggettoService;
    @Autowired private RtsService rtsService;
    @Autowired private IstanzaRepository repository;
    @Autowired private Mapper<Istanza, D> mapper;

    public void prepareInsert(IstanzaDto istanza) throws SvildepException {
        MessageDto soggettoResponse = soggettoService.verificaSoggettiMock(istanza.getRichiedente());
        if (soggettoResponse.isError()) throw new SvildepException(soggettoResponse);

        MessageDto rtsResponse = rtsService.inserimentoInFascicoloMock(istanza.getAllegati());
        if (rtsResponse.isError()) throw new SvildepException(rtsResponse);
    }

    public D get(Long id) { return mapper.mapEntityToDto(repository.get(id)); }

    public List<D> getAll() { return mapper.mapEntityToDto(repository.getAll()); }

    public D insert(D dto) throws SvildepException { return mapper.mapEntityToDto(repository.insert(mapper.mapDtoToEntity(dto))); }

    public boolean update(D dto) throws SvildepException { return repository.update(mapper.mapDtoToEntity(dto)); }

    public D delete(Long id) { return mapper.mapEntityToDto(repository.delete(id)); }

    public void drop() { repository.drop(); }
}

package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.external.EntitaService;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaService {

    private final SoggettoService soggettoService;
    private final RtsService rtsService;
    private final EntitaService entitaService;

    public MessageDto insert(IstanzaDto requestDto) throws SvildepException {
        MessageDto response = soggettoService.verificaSoggettiMock(requestDto.getRichiedente());
        if (response.isError()) throw new SvildepException(response);

        response = rtsService.inserimentoInFascicoloMock(requestDto.getAllegati());
        if (response.isError()) throw new SvildepException(response);

        response = entitaService.inserimentoIstanzaMock(requestDto);
        return response;
    }

}

package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.inserimento.IstanzaInserimentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaInserimentoService<D extends IstanzaInserimentoDto> extends IstanzaService {

    private final IstanzaInserimentoMapper<D> istanzaInserimentoMapper;

    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza entity = istanzaInserimentoMapper.mapDtoToEntity(istanzaDtoInserimento);
        return getPersistenceService().insertIstanza(entity);
    }

}

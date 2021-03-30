package it.sogei.svildep.istanzaservice.service.inserimento;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.inserimento.IstanzaInserimentoMapper;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public abstract class IstanzaInserimentoService<D extends IstanzaInserimentoDto> extends IstanzaService {

    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza entity = getMapper().mapDtoToEntity(istanzaDtoInserimento);
        return getPersistenceService().insertIstanza(entity);
    }

    public abstract IstanzaInserimentoMapper<D> getMapper();

}

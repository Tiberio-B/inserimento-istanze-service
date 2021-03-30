package it.sogei.svildep.istanzaservice.service.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepCauzionaleInserimentoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.inserimento.IstanzaInserimentoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class IstanzaDepCauzionaleInserimentoService extends IstanzaInserimentoService<IstanzaDepCauzionaleInserimentoDto> {

    private final IstanzaInserimentoMapper<IstanzaDepCauzionaleInserimentoDto> mapper;

}

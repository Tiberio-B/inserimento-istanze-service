package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoVolontarioDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoVolontarioMapperInserimento extends InserimentoIstanzaMapper<DepositoVolontarioDtoInserimento> {

    @Override
    public DepositoVolontarioDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        return super.fromIstanzaToDto(entity, new DepositoVolontarioDtoInserimento());
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoVolontarioDtoInserimento dto) throws SvildepException {
        return super.fromDtoToIstanza(dto);
    }
}

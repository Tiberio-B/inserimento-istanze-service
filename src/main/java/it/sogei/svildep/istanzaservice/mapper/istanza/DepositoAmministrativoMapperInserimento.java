package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoAmministrativoDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.BeneMapper;
import it.sogei.svildep.istanzaservice.mapper.OperaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepositoAmministrativoMapperInserimento extends InserimentoIstanzaMapper<DepositoAmministrativoDtoInserimento> {

    private final OperaMapper operaMapper;
    private final BeneMapper beneMapper;

    @Override
    public DepositoAmministrativoDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoAmministrativoDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoAmministrativoDtoInserimento());
        dto.setDepositante(getSoggettoMapper().mapEntityToDto(entity.getDepositante()));
        dto.setAutoritaEspropriante(getSoggettoMapper().mapEntityToDto(entity.getAutoritaEspropriante()));
        dto.setDatiOpera(operaMapper.mapEntityToDto(entity.getDatiOpera()));
        dto.setBeneEspropriato(beneMapper.mapEntityToDto(entity.getBeneEspropriato()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoAmministrativoDtoInserimento dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setDepositante(getSoggettoMapper().mapDtoToEntity(dto.getDepositante()));
        entity.setAutoritaEspropriante(getSoggettoMapper().mapDtoToEntity(dto.getAutoritaEspropriante()));
        entity.setDatiOpera(operaMapper.mapDtoToEntity(dto.getDatiOpera()));
        entity.setBeneEspropriato(beneMapper.mapDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }
}

package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoAmministrativoNoEsproprioDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoAmministrativoNoEsproprioMapperInserimento extends InserimentoIstanzaMapper<DepositoAmministrativoNoEsproprioDtoInserimento> {

    @Override
    public DepositoAmministrativoNoEsproprioDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoAmministrativoNoEsproprioDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoAmministrativoNoEsproprioDtoInserimento());
        dto.setVersante(getSoggettoMapper().mapEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(getSoggettoMapper().mapEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoAmministrativoNoEsproprioDtoInserimento dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setVersante(getSoggettoMapper().mapDtoToEntity(dto.getVersante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().mapDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }
}

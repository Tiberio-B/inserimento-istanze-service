package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoCauzionaleDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.SoggettoGiuridico;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoCauzionaleMapperInserimento extends InserimentoIstanzaMapper<DepositoCauzionaleDtoInserimento> {

    @Override
    public DepositoCauzionaleDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoCauzionaleDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoCauzionaleDtoInserimento());


        dto.setProprietario(super.getSoggettoMapper().mapEntityToDtoImpl(entity.getProprietario().getSoggetto()));
        dto.setEnteCauzionato((SoggettoGiuridicoDto) super.getSoggettoMapper().mapEntityToDtoImpl(entity.getEnteCauzionato().getSoggetto()));

        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoCauzionaleDtoInserimento dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setProprietario(super.getSoggettoMapper().mapDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(super.getSoggettoMapper().mapDtoToEntity(dto.getEnteCauzionato()));
        entity.setProprietario(getSoggettoMapper().mapDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(getSoggettoMapper().mapDtoToEntity(dto.getEnteCauzionato()));
        return entity;
    }
}

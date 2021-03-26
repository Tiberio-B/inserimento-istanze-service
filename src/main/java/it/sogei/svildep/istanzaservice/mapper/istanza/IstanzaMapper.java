package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<D extends IstanzaDto> implements Mapper<Istanza, D> {

    @Autowired private DirittoSoggettoMapper dirittoSoggettoMapper;

    public D daIstanzaADto(Istanza entity, D dto) {
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));
        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));
        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());
        dto.setCategoriaDepositoId(String.valueOf(entity.getCategoriaDeposito().getId()));
        dto.setTipoId(String.valueOf(entity.getTipo().getId()));
        dto.setStatoId(String.valueOf(entity.getStato().getId()));
        dto.setRichiedente(dirittoSoggettoMapper.mapEntityToDto(entity.getRichiedente()));
        return dto;
    }

    public Istanza daDtoAIstanza(D dto) throws SvildepException {
        Istanza entity = new Istanza();
        entity.setNumeroRichiesta(Long.parseLong(dto.getNumeroRichiesta()));
        entity.setDataRichiesta(LocalDate.parse(dto.getDataRichiesta()));
        entity.setNumeroProtocollo(Long.parseLong(dto.getNumeroProtocollo()));
        entity.setDataProtocollo(LocalDate.parse(dto.getDataProtocollo()));
        entity.setImportoDeposito(Long.parseLong(dto.getImportoDeposito()));
        entity.setCausaleDeposito(dto.getCausaleDeposito());
        entity.setRichiedente(dirittoSoggettoMapper.mapDtoToEntity(dto.getRichiedente()));
        return entity;
    }
}

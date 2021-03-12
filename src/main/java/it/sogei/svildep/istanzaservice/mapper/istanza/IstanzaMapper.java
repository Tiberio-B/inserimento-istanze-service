package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.*;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<I extends Istanza, D extends IstanzaDto> implements Mapper<I, D> {

    @Getter
    @Autowired private SoggettoMapper soggettoMapper;
    @Autowired private DepositoMapper depositoMapper;
    @Autowired private RichiestaMapper richiestaMapper;
    @Autowired private ProtocolloMapper protocolloMapper;
    @Autowired private RtsMapper rtsMapper;
    @Autowired private DocumentoMapper documentoMapper;

    D mapIstanzaEntityToDto(I entity, D dto) {
        dto.setQualitaRichiedente(entity.getQualitaRichiedente().toString());
        dto.setCategoriaDeposito(entity.getCategoriaDeposito().toString());
        dto.setStato(entity.getStato().toString());
        dto.setRichiedente(soggettoMapper.convertEntityToDto(entity.getRichiedente()));
        dto.setDatiDeposito(depositoMapper.convertEntityToDto(entity.getDatiDeposito()));
        dto.setDatiRichiesta(richiestaMapper.convertEntityToDto(entity.getDatiRichiesta()));
        dto.setDatiProtocollo(protocolloMapper.convertEntityToDto(entity.getDatiProtocollo()));
        dto.setRtsInoltro(rtsMapper.convertEntityToDto(entity.getRtsInoltro()));
        dto.setAllegati(documentoMapper.convertEntityToDto(entity.getAllegati()));
        return dto;
    }

    I mapIstanzaDtoToEntity(D dto, I entity) throws SvildepException {
        try {
            entity.setQualitaRichiedente(Istanza.QualitaRichiedente.valueOf(dto.getQualitaRichiedente()));
            entity.setCategoriaDeposito(Istanza.Categoria.valueOf(dto.getCategoriaDeposito()));
            entity.setStato(Istanza.Stato.valueOf(dto.getStato()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getMessage());
        }
        entity.setRichiedente(soggettoMapper.convertDtoToEntity(dto.getRichiedente()));
        entity.setDatiDeposito(depositoMapper.convertDtoToEntity(dto.getDatiDeposito()));
        entity.setDatiRichiesta(richiestaMapper.convertDtoToEntity(dto.getDatiRichiesta()));
        entity.setDatiProtocollo(protocolloMapper.convertDtoToEntity(dto.getDatiProtocollo()));
        entity.setRtsInoltro(rtsMapper.convertDtoToEntity(dto.getRtsInoltro()));
        entity.setAllegati(documentoMapper.convertDtoToEntity(dto.getAllegati()));
        return entity;
    }
}

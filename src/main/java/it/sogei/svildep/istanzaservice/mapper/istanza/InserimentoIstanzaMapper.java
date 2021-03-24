package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.InserimentoIstanzaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class InserimentoIstanzaMapper<Dto extends InserimentoIstanzaDto> extends IstanzaMapper<Dto> {

    @Getter
    @Autowired private SoggettoMapper soggettoMapper;
    @Autowired private DepositoMapper depositoMapper;
    @Autowired private RichiestaMapper richiestaMapper;
    @Autowired private ProtocolloMapper protocolloMapper;
    @Autowired private RtsMapper rtsMapper;
    @Autowired private DocumentoMapper documentoMapper;

    public Dto fromIstanzaToDto(Istanza entity, Dto dto) {
        dto.setQualitaRichiedente(entity.getQualitaRichiedente().toString());
        dto.setCategoriaDeposito(entity.getCategoriaDeposito().toString());
        dto.setStato(entity.getStato().toString());
        dto.setRichiedente(soggettoMapper.mapEntityToDto(entity.getRichiedente()));
        dto.setDatiDeposito(depositoMapper.mapEntityToDto(entity.getDatiDeposito()));
        dto.setDatiRichiesta(richiestaMapper.mapEntityToDto(entity.getDatiRichiesta()));
        dto.setDatiProtocollo(protocolloMapper.mapEntityToDto(entity.getDatiProtocollo()));
        dto.setRtsInoltro(rtsMapper.mapEntityToDto(entity.getRtsInoltro()));
        dto.setAllegati(documentoMapper.mapEntityToDto(entity.getAllegati()));
        return dto;
    }

    public Istanza fromDtoToIstanza(Dto dto) throws SvildepException {
        Istanza entity = new Istanza();
        try {
            entity.setQualitaRichiedente(Istanza.QualitaRichiedente.valueOf(dto.getQualitaRichiedente()));
            entity.setCategoriaDeposito(Istanza.Categoria.valueOf(dto.getCategoriaDeposito()));
            entity.setStato(Istanza.Stato.valueOf(dto.getStato()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getMessage());
        }
        entity.setRichiedente(soggettoMapper.mapDtoToEntity(dto.getRichiedente()));
        entity.setDatiDeposito(depositoMapper.mapDtoToEntity(dto.getDatiDeposito()));
        entity.setDatiRichiesta(richiestaMapper.mapDtoToEntity(dto.getDatiRichiesta()));
        entity.setDatiProtocollo(protocolloMapper.mapDtoToEntity(dto.getDatiProtocollo()));
        entity.setRtsInoltro(rtsMapper.mapDtoToEntity(dto.getRtsInoltro()));
        entity.setAllegati(documentoMapper.mapDtoToEntity(dto.getAllegati()));
        return entity;
    }
}

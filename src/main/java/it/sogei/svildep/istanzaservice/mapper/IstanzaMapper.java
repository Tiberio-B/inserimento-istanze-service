package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.istanza.*;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.*;
import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Istanza;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaMapper implements Mapper<Istanza, IstanzaDto> {

    private final SoggettoMapper soggettoMapper;
    private final DepositoMapper depositoMapper;
    private final RichiestaMapper richiestaMapper;
    private final ProtocolloMapper protocolloMapper;
    private final RtsMapper rtsMapper;
    private final DocumentoMapper documentoMapper;
    private final OperaMapper operaMapper;
    private final BeneMapper beneMapper;

    @Override
    public IstanzaDto convertEntityToDtoImpl(Istanza entity) {
        switch (entity.getCategoriaDeposito()) {
            case DECRETO_SVINCOLO_REINTROITO: return convertDecretoSvincoloReintroito(entity);
            case DEPOSITO_AMMINISTRATIVO: return convertDepositoAmministrativo(entity);
            case DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO: return convertDepositoAmministrativoNoEsproprio(entity);
            case DEPOSITO_CAUZIONALE: return convertDepositoCauzionale(entity);
            case DEPOSITO_GIUDIZIARIO: return convertDepositoGiudiziario(entity);
            case DEPOSITO_VOLONTARIO: return convertDepositoVolontario(entity);
            case RESTITUZIONE_DEPOSITO: return convertRestituzioneDeposito(entity);
            default: return null;
        }
    }

    @Override
    public Istanza convertDtoToEntityImpl(IstanzaDto dto) throws SvildepException {
        switch (dto.getCategoriaDeposito()) {
            case "DECRETO_SVINCOLO_REINTROITO": if (dto.getClass().equals(DecretoSvincoloReintroitoDto.class)) return convertDecretoSvincoloReintroito((DecretoSvincoloReintroitoDto) dto);
            case "DEPOSITO_AMMINISTRATIVO": if (dto.getClass().equals(DepositoAmministrativoDto.class))return convertDepositoAmministrativo((DepositoAmministrativoDto) dto);
            case "DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO": if (dto.getClass().equals(DepositoAmministrativoNoEsproprioDto.class)) return convertDepositoAmministrativoNoEsproprio((DepositoAmministrativoNoEsproprioDto) dto);
            case "DEPOSITO_CAUZIONALE": if (dto.getClass().equals(DepositoCauzionaleDto.class)) return convertDepositoCauzionale((DepositoCauzionaleDto) dto);
            case "DEPOSITO_GIUDIZIARIO": if (dto.getClass().equals(DepositoGiudiziarioDto.class)) return convertDepositoGiudiziario((DepositoGiudiziarioDto) dto);
            case "DEPOSITO_VOLONTARIO": if (dto.getClass().equals(DepositoVolontarioDto.class)) return convertDepositoVolontario((DepositoVolontarioDto) dto);
            case "RESTITUZIONE_DEPOSITO": if (dto.getClass().equals(RestituzioneDepositoDto.class))return convertRestituzioneDeposito((RestituzioneDepositoDto) dto);
            default: throw new SvildepException();
        }
    }

    private DecretoSvincoloReintroitoDto convertDecretoSvincoloReintroito(Istanza entity) {
        return (DecretoSvincoloReintroitoDto) mapIstanzaEntityToDto(entity, new DecretoSvincoloReintroitoDto());
    }

    private DepositoAmministrativoDto convertDepositoAmministrativo(Istanza entity) {
        DepositoAmministrativoDto dto = (DepositoAmministrativoDto) mapIstanzaEntityToDto(entity, new DepositoAmministrativoDto());
        dto.setDepositante(soggettoMapper.convertEntityToDto(entity.getDepositante()));
        dto.setAutoritaEspropriante(soggettoMapper.convertEntityToDto(entity.getAutoritaEspropriante()));
        dto.setDatiOpera(operaMapper.convertEntityToDto(entity.getDatiOpera()));
        dto.setBeneEspropriato(beneMapper.convertEntityToDto(entity.getBeneEspropriato()));
        return dto;
    }

    private DepositoAmministrativoNoEsproprioDto convertDepositoAmministrativoNoEsproprio(Istanza entity) {
        DepositoAmministrativoNoEsproprioDto dto = (DepositoAmministrativoNoEsproprioDto) mapIstanzaEntityToDto(entity, new DepositoAmministrativoNoEsproprioDto());
        dto.setVersante(soggettoMapper.convertEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(soggettoMapper.convertEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    private DepositoCauzionaleDto convertDepositoCauzionale(Istanza entity) {
        DepositoCauzionaleDto dto = (DepositoCauzionaleDto) mapIstanzaEntityToDto(entity, new DepositoCauzionaleDto());
        dto.setProprietario(soggettoMapper.convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(soggettoMapper.convertEntityToDto(entity.getEnteRichiedente()));
        dto.setProprietario(soggettoMapper.convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(soggettoMapper.convertEntityToDto(entity.getEnteRichiedente()));
        return dto;

    }

    private DepositoGiudiziarioDto convertDepositoGiudiziario(Istanza entity) {
        DepositoGiudiziarioDto dto = (DepositoGiudiziarioDto) mapIstanzaEntityToDto(entity, new DepositoGiudiziarioDto());
        dto.setVersante(soggettoMapper.convertEntityToDto(entity.getVersante()));
        dto.setAutoritaOrdinante(soggettoMapper.convertEntityToDto(entity.getAutoritaOrdinante()));
        dto.setSoggettoUlteriore(soggettoMapper.convertEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    private DepositoVolontarioDto convertDepositoVolontario(Istanza entity) {
        return (DepositoVolontarioDto) mapIstanzaEntityToDto(entity, new DepositoVolontarioDto());
    }

    private RestituzioneDepositoDto convertRestituzioneDeposito(Istanza entity) {
        RestituzioneDepositoDto dto = (RestituzioneDepositoDto) mapIstanzaEntityToDto(entity, new RestituzioneDepositoDto());
        // TO-DO
        return null;
    }

    private Istanza convertDecretoSvincoloReintroito(DecretoSvincoloReintroitoDto dto) throws SvildepException {
        return mapIstanzaDtoToEntity(dto, new Istanza());
    }

    private Istanza convertDepositoAmministrativo(DepositoAmministrativoDto dto) throws SvildepException {
        Istanza entity = mapIstanzaDtoToEntity(dto, new Istanza());
        entity.setDepositante(soggettoMapper.convertDtoToEntity(dto.getDepositante()));
        entity.setAutoritaEspropriante(soggettoMapper.convertDtoToEntity(dto.getAutoritaEspropriante()));
        entity.setDatiOpera(operaMapper.convertDtoToEntity(dto.getDatiOpera()));
        entity.setBeneEspropriato(beneMapper.convertDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }

    private Istanza convertDepositoAmministrativoNoEsproprio(DepositoAmministrativoNoEsproprioDto dto) throws SvildepException {
        Istanza entity = mapIstanzaDtoToEntity(dto, new Istanza());
        entity.setVersante(soggettoMapper.convertDtoToEntity(dto.getVersante()));
        entity.setSoggettoUlteriore(soggettoMapper.convertDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }

    private Istanza convertDepositoCauzionale(DepositoCauzionaleDto dto) throws SvildepException {
        Istanza entity = mapIstanzaDtoToEntity(dto, new Istanza());
        entity.setProprietario(soggettoMapper.convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(soggettoMapper.convertDtoToEntity(dto.getEnteRichiedente()));
        entity.setProprietario(soggettoMapper.convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(soggettoMapper.convertDtoToEntity(dto.getEnteRichiedente()));
        return entity;
    }

    private Istanza convertDepositoGiudiziario(DepositoGiudiziarioDto dto) throws SvildepException {
        Istanza entity = mapIstanzaDtoToEntity(dto, new Istanza());
        entity.setVersante(soggettoMapper.convertDtoToEntity(dto.getVersante()));
        entity.setAutoritaOrdinante(soggettoMapper.convertDtoToEntity(dto.getAutoritaOrdinante()));
        entity.setSoggettoUlteriore(soggettoMapper.convertDtoToEntity(dto.getSoggettoUlteriore()));
        return entity;
    }

    private Istanza convertDepositoVolontario(DepositoVolontarioDto dto) throws SvildepException {
        return mapIstanzaDtoToEntity(dto, new Istanza());
    }

    private Istanza convertRestituzioneDeposito(RestituzioneDepositoDto dto) throws SvildepException {
        return mapIstanzaDtoToEntity(dto, new Istanza());
        // TO-DO
    }

    private IstanzaDto mapIstanzaEntityToDto(Istanza entity, IstanzaDto dto) {
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

    private Istanza mapIstanzaDtoToEntity(IstanzaDto dto, Istanza entity) throws SvildepException {
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

package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.NaturaGiuridicaDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagCA;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.NaturaGiuridica;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

import java.time.LocalDate;

public class NaturaGiuridicaMapper implements Mapper<NaturaGiuridica, NaturaGiuridicaDto> {

    @Override
    public NaturaGiuridicaDto mapEntityToDtoImpl(NaturaGiuridica entity) {
        NaturaGiuridicaDto dto = new NaturaGiuridicaDto();
        dto.setDataInizioValidita(String.valueOf(entity.getDataInizioValidita()));
        dto.setDataFineValidita(String.valueOf(entity.getDataFineValidita()));
        dto.setDenominazioneNaturaGiuridica(entity.getDenominazioneNaturaGiuridica());
        dto.setChiusura(String.valueOf(entity.getFlagChiusuraCA()));
        return dto;
    }

    @Override
    public NaturaGiuridica mapDtoToEntityImpl(NaturaGiuridicaDto dto) throws SvildepException {
        NaturaGiuridica entity = new NaturaGiuridica();
        entity.setDataInizioValidita(LocalDate.parse(dto.getDataInizioValidita()));
        entity.setDataFineValidita(LocalDate.parse(dto.getDataFineValidita()));
        entity.setDenominazioneNaturaGiuridica(dto.getDenominazioneNaturaGiuridica());
        entity.setFlagChiusuraCA(FlagCA.valueOf(dto.getChiusura()));
        return entity;

    }
}

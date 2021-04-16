package it.sogei.svildep.service;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.dto.istanza.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.dto.istanza.depGiudiziario.SoggettoUlterioreDto;
import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestionesoggetti.Provincia;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoUlteriore;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.mapper.soggetto.SoggettoUlterioreMapper;
import it.sogei.svildep.repository.SoggettoUlterioreRepository;
import it.sogei.svildep.repository.TipoCoinvolgimentoSoggettoRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDepGiudiziarioService extends CostituzioneDepositoService<CostituzioneDepGiudiziarioDto> {

    private final CostituzioneDepositoMapper<CostituzioneDepGiudiziarioDto> istanzaMapper;

    private final SoggettoUlterioreMapper soggettoUlterioreMapper;

    private final SoggettoUlterioreRepository soggettoUlterioreRepository;
    private final TipoCoinvolgimentoSoggettoRepository tipoCoinvolgimentoSoggettoRepository;

    @Override
    @Transactional
    public MessageDto insert(CostituzioneDepGiudiziarioDto costituzioneDepositoDto) throws SvildepException {
        Istanza istanza = inizioInserimentoIstanza(costituzioneDepositoDto);
        persistSoggettoUlteriore(costituzioneDepositoDto.getSoggettoUlteriore(), istanza);
        return fineInserimentoIstanza(istanza, costituzioneDepositoDto);
    }

    private void persistSoggettoUlteriore(SoggettoUlterioreDto soggettoUlterioreDto, Istanza istanza) throws SvildepException {
        SoggettoUlteriore soggettoUlteriore = soggettoUlterioreMapper.mapDtoToEntity(soggettoUlterioreDto);
        soggettoUlterioreRepository.saveAndFlush(soggettoUlteriore);
        CoinvolgimentoSoggetto coinvolgimentoSoggetto = new CoinvolgimentoSoggetto();
        coinvolgimentoSoggetto.setSoggettoUlteriore(soggettoUlteriore);
        TipoCoinvolgimentoSoggetto tipoSoggettoUleriore = tipoCoinvolgimentoSoggettoRepository.findByFlagTipoCoinvolgimento(FlagTipoCoinvolgimento.CSU)
                .orElseThrow(() -> new SvildepException(Messages.erroreTipoCoinvolgimento));
        coinvolgimentoSoggetto.setTipoCoinvolgimentoSoggetto(tipoSoggettoUleriore);
        coinvolgimentoSoggetto.setIstanza(istanza);
        getCoinvolgimentiRepository().save(coinvolgimentoSoggetto);
    }

}

package it.sogei.svildep.service;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.dto.istanza.depAmministrativo.EsproprioDto;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Provincia;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo.EsproprioMapper;
import it.sogei.svildep.mapper.istanza.costituzione.depAmministrativo.ProprietarioCatastaleMapper;
import it.sogei.svildep.repository.DatoCatastaleRepository;
import it.sogei.svildep.repository.OperaRepository;
import it.sogei.svildep.repository.ProprietarioCatastaleRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDepAmministrativoService extends CostituzioneDepositoService<CostituzioneDepAmministrativoDto> {

    private final CostituzioneDepositoMapper<CostituzioneDepAmministrativoDto> istanzaMapper;

    private final EsproprioMapper esproprioMapper;
    private final ProprietarioCatastaleMapper proprietarioCatastaleMapper;

    private final OperaRepository operaRepository;
    private final DatoCatastaleRepository datoCatastaleRepository;
    private final ProprietarioCatastaleRepository proprietarioCatastaleRepository;

    @Override
    @Transactional
    public MessageDto insert(CostituzioneDepAmministrativoDto costituzioneDepositoDto) throws SvildepException {
        Istanza istanza = inizioInserimentoIstanza(costituzioneDepositoDto);
        gestioneEsproprio(costituzioneDepositoDto.getBeneEspropriato(), istanza);
        Provincia provinciaCompetente = istanza.getBeneEspropriato().getComune().getProvincia();
        return fineInserimentoIstanza(istanza, costituzioneDepositoDto, provinciaCompetente);
    }

    private void gestioneEsproprio(EsproprioDto esproprioDto, Istanza istanza) {
        DatoCatastale beneEspropriato = esproprioMapper.mapDtoToEntity(esproprioDto);
        datoCatastaleRepository.saveAndFlush(beneEspropriato);
        proprietarioCatastaleMapper.mapDtoToEntity(esproprioDto.getProprietariCatastali()).forEach(proprietario -> {
            proprietario.setBeneEspropriato(beneEspropriato);
            proprietarioCatastaleRepository.save(proprietario);
            Fascicolo documentoRelataNotifica = proprietario.getFascicolo();
            if (documentoRelataNotifica != null) getFascicoloRepository().save(documentoRelataNotifica);
        });
        istanza.setBeneEspropriato(beneEspropriato);
        operaRepository.save(istanza.getOpera());
    }

}

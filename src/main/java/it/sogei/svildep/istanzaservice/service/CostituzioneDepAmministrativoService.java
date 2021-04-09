package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.BeneEspropriato;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.ProprietarioCatastale;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depAmministrativo.BeneEspropriatoMapper;
import it.sogei.svildep.istanzaservice.repository.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDepAmministrativoService extends CostituzioneDepositoService<CostituzioneDepAmministrativoDto> {

    private final OperaRepository operaRepository;
    private final BeneEspropriatoRepository beneEspropriatoRepository;
    private final ProprietarioCatastaleRepository proprietarioCatastaleRepository;
    private final FascicoloRepository fascicoloRepository;
    private final DatoCatastaleRepository datoCatastaleRepository;

    private final CostituzioneDepositoMapper<CostituzioneDepAmministrativoDto> istanzaMapper;

    private final BeneEspropriatoMapper beneEspropriatoMapper;

    @Override
    @Transactional
    public MessageDto insert(CostituzioneDepAmministrativoDto istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = super.prepareInsert(istanzaDtoInserimento);
        operaRepository.saveAndFlush(istanza.getOpera());
        istanza.setDatoCatastale(persistDatoCatastale(istanzaDtoInserimento));
        return super.persist(istanza, istanzaDtoInserimento);
    }

    private DatoCatastale persistDatoCatastale(CostituzioneDepAmministrativoDto istanzaDtoInserimento) {
        DatoCatastale datoCatastaleInserito = null;
        for (BeneEspropriato beneEspropriato : beneEspropriatoMapper.mapDtoToEntity(istanzaDtoInserimento.getBeneEspropriato())) {
            if (datoCatastaleInserito == null) { // effettua l'inserimento solo alla prima iterazione, perche' e' sempre lo stesso
                datoCatastaleInserito = datoCatastaleRepository.saveAndFlush(beneEspropriato.getDatoCatastale());
            }
            ProprietarioCatastale proprietarioCatastale = beneEspropriato.getProprietarioCatastale();
            persistDocumentoRelataNotifica(proprietarioCatastale);
            proprietarioCatastaleRepository.saveAndFlush(proprietarioCatastale);
            beneEspropriato.setDatoCatastale(datoCatastaleInserito);
            beneEspropriatoRepository.saveAndFlush(beneEspropriato);
        }
        return datoCatastaleInserito;
    }

    private void persistDocumentoRelataNotifica(ProprietarioCatastale proprietarioCatastale) { // da rivedere
        fascicoloRepository.saveAndFlush(proprietarioCatastale.getDocumentoRelataNotifica());
    }

}

package it.sogei.svildep.istanzaservice.mapper.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaRestituzioneDepositoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento.ModalitaPagamento;
import org.springframework.stereotype.Component;

@Component
public class IstanzaRestitutizioneDepositoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaRestituzioneDepositoInserimentoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaRestituzioneDepositoInserimentoDto dto) throws RuntimeException {
        Istanza entity = getIstanzaMapper().mapDtoToEntityImpl(dto);
        ModalitaPagamento mp = new ModalitaPagamento();
        mp.setId(Long.parseLong(dto.getModalitaPagamentoId()));
        entity.setModalitaPagamento(mp);
        return entity;
    }
}

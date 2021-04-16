package it.sogei.svildep.mapper.istanza.costituzione.restituzioneDep;

import it.sogei.svildep.dto.istanza.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionemodalitapagamento.ModalitaPagamento;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneRestitutizioneDepMapper extends CostituzioneDepositoMapper<CostituzioneRestituzioneDepDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneRestituzioneDepDto dto) throws RuntimeException {
        Istanza entity = getIstanzaMapper().mapDtoToEntityImpl(dto);
        ModalitaPagamento mp = new ModalitaPagamento();
        mp.setId(Long.parseLong(dto.getModalitaPagamentoId()));
        entity.setModalitaPagamento(mp);
        return entity;
    }
}

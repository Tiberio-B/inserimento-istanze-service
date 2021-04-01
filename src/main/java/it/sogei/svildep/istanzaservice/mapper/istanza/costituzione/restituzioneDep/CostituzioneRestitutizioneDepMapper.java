package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.restituzioneDep;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento.ModalitaPagamento;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
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

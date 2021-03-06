package it.sogei.svildep.dto;

import it.sogei.svildep.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public abstract class SvildepDto {

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String utenteInserimentoId;

	private String timestampInserimento;

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String utenteAggiornamentoId;

	private String timestampAggiornamento;

}

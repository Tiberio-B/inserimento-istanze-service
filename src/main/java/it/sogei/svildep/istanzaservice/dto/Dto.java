package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public abstract class Dto {

	private String id;

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String idUtenteInserimento;

	private String timestampInserimento;

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String idUtenteAggiornamento;

	private String timestampAggiornamento;
}

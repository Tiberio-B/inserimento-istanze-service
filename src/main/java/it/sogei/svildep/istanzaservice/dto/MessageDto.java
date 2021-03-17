package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class MessageDto extends Dto {

    private String content;

    private HttpStatus status;

    public static MessageDto nonAutorizzato() { return new MessageDto(Messages.nonAutorizzato, HttpStatus.UNAUTHORIZED); }

    public static MessageDto inserito() { return new MessageDto(Messages.inserimento, HttpStatus.CREATED); }

    public boolean isError() { return this.getStatus().isError(); }
}

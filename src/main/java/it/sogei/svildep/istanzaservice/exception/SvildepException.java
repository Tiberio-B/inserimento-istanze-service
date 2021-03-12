package it.sogei.svildep.istanzaservice.exception;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public
class SvildepException extends Exception {

    private MessageDto messageDto;

    public SvildepException(MessageDto messageDto) {
        super(messageDto.getContent());
        setMessageDto(messageDto);
    }

    public SvildepException(String message, HttpStatus status) { this(new MessageDto(message, status)); }

    public SvildepException(String message) { this(message, HttpStatus.INTERNAL_SERVER_ERROR); }
}

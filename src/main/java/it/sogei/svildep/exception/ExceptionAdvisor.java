package it.sogei.svildep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "it.sogei.svildep")
public class ExceptionAdvisor {

	@ExceptionHandler(it.sogei.svildep.exception.SvildepException.class)
	public ResponseEntity<String> handleException(it.sogei.svildep.exception.SvildepException ex) {
		return ResponseEntity.status(ex.getStatus()).body(ex.getMessage());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}

}

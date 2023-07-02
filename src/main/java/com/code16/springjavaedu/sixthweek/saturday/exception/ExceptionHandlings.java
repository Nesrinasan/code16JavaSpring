package com.code16.springjavaedu.sixthweek.saturday.exception;

import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlings {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(MailException.class)
	public ResponseEntity<String> mailExceptionHandler(MailException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> userExceptionHandler(UserException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

}

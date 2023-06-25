package com.code16.springjavaedu.fifthweek.saturday.springbootexception;


import com.code16.springjavaedu.fifthweek.saturday.myexception.BusinessException;
import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> userExceptionHandler(UserException userException){
		return new ResponseEntity<>(userException.getMessage(), HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> businessExceptionHandler(BusinessException businessException){
		return new ResponseEntity<>(businessException.getMessage(), HttpStatus.BAD_REQUEST);
	}


}

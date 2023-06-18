package com.code16.springjavaedu.fourthweek.sunday.springbootexception;


import com.code16.springjavaedu.fourthweek.sunday.myException.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> methodNullPointerExceptionHandler(NullPointerException ex) {
        return new ResponseEntity<String>("null data is entered", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> businessExceptionHandler(BusinessException e) {
        return new ResponseEntity<>("Business Exception oluştu.", HttpStatus.BAD_REQUEST);

    }

}

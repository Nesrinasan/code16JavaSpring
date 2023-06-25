package com.code16.springjavaedu.fifthweek.saturday.myexception;

public class BusinessException extends Exception{

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}


}

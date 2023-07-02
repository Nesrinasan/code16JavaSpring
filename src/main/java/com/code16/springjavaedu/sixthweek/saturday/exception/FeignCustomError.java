package com.code16.springjavaedu.sixthweek.saturday.exception;

import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignCustomError implements ErrorDecoder {

	@Override
	public Exception decode(String s, Response response) {
		switch (response.status()){
			case 500:
				return new Exception("İşleminiz şuanda gerçeklşeştirilemiyor.");
			case 400:
				return new UserException("Kullanıcının bu apiye erişim yetkisi yok.");
			default:
				return new Exception("General Exception");
		}
	}
}

package com.code16.springjavaedu.sixthweek.saturday.feign;

import com.code16.springjavaedu.sixthweek.saturday.exception.MailException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userManagement", url = "http://127.0.0.1:8080")
public interface UserManagementFeign {

	@GetMapping(value = "/user/sendMail")
	@CircuitBreaker(name = "sendMailCBreaker", fallbackMethod = "sendMailFallback")
	@Retry(name="sendMailRetry", fallbackMethod = "sendMailRetryFallback")
	void sendMail(@RequestParam String email);

	default void sendMailFallback(String email, Exception e){
		throw new MailException("Mailin gönderilirken bir hata oluştur. mail adresinizi kontrol edin. mail: " + email);
	}

	default void sendMailRetryFallback(String email, Exception e){
		throw new MailException("Mailin gönderilirken bir hata oluştur. mail adresinizi kontrol edin. mail: " + email);

	}
}

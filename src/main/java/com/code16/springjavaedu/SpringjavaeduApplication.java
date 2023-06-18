package com.code16.springjavaedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing
public class SpringjavaeduApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjavaeduApplication.class, args);
	}

}

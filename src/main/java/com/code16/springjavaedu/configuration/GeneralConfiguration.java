package com.code16.springjavaedu.configuration;


import com.code16.springjavaedu.fourthweek.saturday.packagestructure.model.Student;
//import com.code16.springjavaedu.fourthweek.sunday.restcall.openfeign.FeignCustomError;
import feign.Logger;
import feign.codec.ErrorDecoder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpHeaders;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableCaching
@EnableScheduling
public class GeneralConfiguration {

	public static List<Student> studentList = new ArrayList<>();

	@PostConstruct
	public void fillStudentList() {
		Student student = new Student();
		student.setName("Nesrin");
		student.setNumber(123);

		Student student1 = new Student();
		student1.setName("Doruk");
		student1.setNumber(234);

		studentList.add(student);
		studentList.add(student1);
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}

}

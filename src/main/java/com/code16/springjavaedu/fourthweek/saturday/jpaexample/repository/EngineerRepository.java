package com.code16.springjavaedu.fourthweek.saturday.jpaexample.repository;

import com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity.Engineer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EngineerRepository extends CrudRepository<Engineer, Long>{
	List<Engineer> findEngineerByName(String name);

	Engineer findAllByName(String name);

}

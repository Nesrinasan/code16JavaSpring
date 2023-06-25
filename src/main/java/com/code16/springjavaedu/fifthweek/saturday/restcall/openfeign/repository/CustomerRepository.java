package com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.repository;

import com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

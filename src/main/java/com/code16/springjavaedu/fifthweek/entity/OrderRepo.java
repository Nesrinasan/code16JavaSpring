package com.code16.springjavaedu.fifthweek.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Orders, Long> {


}

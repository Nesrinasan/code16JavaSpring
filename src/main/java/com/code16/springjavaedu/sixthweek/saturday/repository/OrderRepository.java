package com.code16.springjavaedu.sixthweek.saturday.repository;

import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long> {
}

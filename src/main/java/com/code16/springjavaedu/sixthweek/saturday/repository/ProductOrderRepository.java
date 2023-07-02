package com.code16.springjavaedu.sixthweek.saturday.repository;

import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {

	List<ProductOrder> findAllByOrders(Orders orders);
}

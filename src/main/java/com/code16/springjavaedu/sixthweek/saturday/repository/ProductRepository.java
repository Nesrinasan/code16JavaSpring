package com.code16.springjavaedu.sixthweek.saturday.repository;

import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query(value = "SELECT p FROM Product p WHERE p.id IN (SELECT po.product.id FROM ProductOrder po WHERE po.orders.id = :orderId)")
	List<Product> findProductsByOrderId(@Param("orderId") Long orderId);

	List<Product> findAllByCategory(String category);
}

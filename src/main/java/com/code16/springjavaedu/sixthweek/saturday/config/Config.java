package com.code16.springjavaedu.sixthweek.saturday.config;

import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import com.code16.springjavaedu.sixthweek.saturday.exception.FeignCustomError;
import com.code16.springjavaedu.sixthweek.saturday.repository.OrderRepository;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductOrderRepository;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductRepository;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class Config {
	private final ProductRepository productRepository;
	private final OrderRepository orderRepository;

	private final ProductOrderRepository productOrderRepository;

	@PostConstruct
	public void createOrder(){
		Product product = new Product();
		product.setCategory("TV");
		product.setName("Samsung42536");
		product.setPrice(120.0);
		productRepository.save(product);

		Product product2 = new Product();
		product2.setCategory("TV");
		product2.setName("Samsung652");
		product2.setPrice(150.0);
		productRepository.save(product2);

		Orders orders = new Orders();
		orders.setOrderNumber("42536532");
		orderRepository.save(orders);

		ProductOrder productOrder = new ProductOrder();
		productOrder.setOrders(orders);
		productOrder.setProduct(product);

		productOrderRepository.save(productOrder);

		ProductOrder productOrder2 = new ProductOrder();
		productOrder2.setOrders(orders);
		productOrder2.setProduct(product2);
		productOrderRepository.save(productOrder2);

	}
	@Bean
	public ErrorDecoder errorDecoder() {
		return new FeignCustomError();
	}

}

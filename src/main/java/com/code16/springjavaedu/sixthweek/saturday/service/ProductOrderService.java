package com.code16.springjavaedu.sixthweek.saturday.service;

import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import com.code16.springjavaedu.sixthweek.saturday.feign.UserManagementFeign;
import com.code16.springjavaedu.sixthweek.saturday.repository.OrderRepository;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductOrderRepository;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductOrderService {

	private final ProductOrderRepository productOrderRepository;
	private final OrderRepository orderRepository;

	private final ProductRepository productRepository;

	private final UserManagementFeign userManagementFeign;

	public List<ProductOrder> getOrder(Long orderId){
		Orders orders = orderRepository.findById(orderId).get();
		return productOrderRepository.findAllByOrders(orders);

	}

	public Double totalPriceN1Problem(Long orderId){
		Orders orders = orderRepository.findById(orderId).get();
		List<ProductOrder> productOrderList = productOrderRepository.findAllByOrders(orders);
		Double totalPrice =0.0;
		for (ProductOrder productOrder : productOrderList) {
			Product product = productOrder.getProduct();
			Double price = product.getPrice();
			totalPrice = totalPrice + price;
		}
		return totalPrice;

	}

	public Double totalPriceN1ProblemSolution(Long orderId){
		Double totalPrice = 0.0;
		List<Product> productsByOrderId = productRepository.findProductsByOrderId(orderId);
		for (Product product : productsByOrderId) {
			Double price = product.getPrice();
			totalPrice = totalPrice + price;

		}
		return totalPrice;
	}

	public void saveOrder(Long productId){
		Product product = productRepository.findById(productId).get();
		Orders orders = new Orders();
		orders.setOrderNumber(UUID.randomUUID().toString());
		orders = orderRepository.save(orders);
		ProductOrder productOrder = new ProductOrder();
		productOrder.setProduct(product);
		productOrder.setOrders(orders);
		productOrderRepository.save(productOrder);
		sendUserMail();

	}

	private void sendUserMail() {

		userManagementFeign.sendMail("nesrin.asan@gmail.com");


	}

}

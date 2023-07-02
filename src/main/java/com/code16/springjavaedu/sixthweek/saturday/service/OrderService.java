package com.code16.springjavaedu.sixthweek.saturday.service;

import com.code16.springjavaedu.sixthweek.saturday.dto.OrderResponseDto;
import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import com.code16.springjavaedu.sixthweek.saturday.repository.OrderRepository;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductOrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;
	private final ModelMapper modelMapper;

	public OrderResponseDto getOrder(Long orderId){
		Orders orders1 = new Orders();

		Orders orders = orderRepository.findById(orderId).get();
		orders.equals(orders1);
//		Product product = orders.getProduct();
//		Double price = product.getPrice();
		OrderResponseDto orderResponseDto = modelMapper.map(orders, OrderResponseDto.class);
//		orderResponseDto.setPrice(price);
		return orderResponseDto;
	}

}

package com.code16.springjavaedu.sixthweek.saturday.controller;

import com.code16.springjavaedu.sixthweek.saturday.dto.OrderResponseDto;
import com.code16.springjavaedu.sixthweek.saturday.entity.Orders;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import com.code16.springjavaedu.sixthweek.saturday.service.OrderService;
import com.code16.springjavaedu.sixthweek.saturday.service.ProductOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderService;

	@GetMapping()
	public OrderResponseDto getOrder(@RequestParam Long orderId){
		return orderService.getOrder(orderId);
	}





}

package com.code16.springjavaedu.sixthweek.saturday.controller;

import com.code16.springjavaedu.sixthweek.saturday.dto.OrderResponseDto;
import com.code16.springjavaedu.sixthweek.saturday.entity.ProductOrder;
import com.code16.springjavaedu.sixthweek.saturday.service.ProductOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productOrder")
@RequiredArgsConstructor
public class ProductOrderController {
	private final ProductOrderService productOrderService;

	@GetMapping("/order")
	public List<ProductOrder> getOrder(@RequestParam Long orderId){
		return productOrderService.getOrder(orderId);
	}

	@GetMapping("/totalPrice")
	public Double totalPrice(@RequestParam Long orderId){
		return productOrderService.totalPriceN1Problem(orderId);
	}

	@GetMapping("/totalPriceN1Solution")
	public Double totalPriceN1Solution(@RequestParam Long orderId){
		return productOrderService.totalPriceN1ProblemSolution(orderId);
	}

	@PostMapping("/saveOrder")
	public void saveOrder(@RequestParam Long productId){
		productOrderService.saveOrder(productId);
	}

}

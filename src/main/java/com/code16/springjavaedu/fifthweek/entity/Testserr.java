package com.code16.springjavaedu.fifthweek.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Testserr {
	private final TestRepo testRepo;
	private final OrderRepo orderRepo;

	public Product save(Product product){
		return testRepo.save(product);
	}

	public Product get(long product){
		return testRepo.findById(product).get();
	}
	public void order(long product){
		Orders order = new Orders();
		Product product1 = testRepo.findById(product).get();
		order.setProduct(product1);
		orderRepo.save(order);


	}

	public Orders orderget(long order){
		return orderRepo.findById(order).get();

	}


}

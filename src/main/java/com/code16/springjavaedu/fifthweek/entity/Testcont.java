package com.code16.springjavaedu.fifthweek.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siparis")
@RequiredArgsConstructor
public class Testcont {
	private final Testserr testserr;

	@GetMapping("/rrrr")
	public void getStudentList(){
		Product product = new Product();
		product.setName("testtt");
		product = testserr.save(product);
		System.out.println();

	}

	@GetMapping("/getir")
	public void getStudentLists(@RequestParam long id){
		Product product = testserr.get(id);
		product.setName("sfdf");
		testserr.save(product);
		System.out.println();

	}

	@GetMapping("/order")
	public void addorder(@RequestParam long id){
		 testserr.order(id);


	}

	@GetMapping("/orderget")
	public void orderget(@RequestParam long id){
		Orders orderget = testserr.orderget(id);
		System.out.println(orderget);


	}
}

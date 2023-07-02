package com.code16.springjavaedu.sixthweek.saturday.job;

import com.code16.springjavaedu.sixthweek.saturday.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductJob {

	private final ProductService productService;

	@Value(value = "${product.category}")
	private String category;

//	@Scheduled(fixedDelay = 1000)
	public void productListRefresh() {
		productService.getListProductPut(category);

	}

}

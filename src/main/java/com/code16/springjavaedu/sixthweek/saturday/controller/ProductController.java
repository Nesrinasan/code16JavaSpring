package com.code16.springjavaedu.sixthweek.saturday.controller;

import com.code16.springjavaedu.sixthweek.saturday.dto.ProductResponseDto;
import com.code16.springjavaedu.sixthweek.saturday.dto.ProductSaveRequestDto;
import com.code16.springjavaedu.sixthweek.saturday.service.ProductOrderService;
import com.code16.springjavaedu.sixthweek.saturday.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	/**
	 * cacheble
	 * @return
	 */
	@GetMapping("/productList")
	public List<ProductResponseDto> getProductList(@RequestParam String category) {
		return productService.getListProduct(category);

	}

	/**
	 * cacheput
	 * @return
	 */
	@GetMapping("/productListPut")
	public List<ProductResponseDto> getProductListPut(@RequestParam String category) {
		return productService.getListProductPut(category);

	}

	@PostMapping("/save")
	public ResponseEntity<Long> save(@RequestBody ProductSaveRequestDto productSaveRequestDto) {
		Long productId = productService.save(productSaveRequestDto);
		return new ResponseEntity<>(productId, HttpStatus.CREATED);

	}


}

package com.code16.springjavaedu.sixthweek.saturday.service;

import com.code16.springjavaedu.sixthweek.saturday.convert.ProductConverter;
import com.code16.springjavaedu.sixthweek.saturday.dto.ProductResponseDto;
import com.code16.springjavaedu.sixthweek.saturday.dto.ProductSaveRequestDto;
import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import com.code16.springjavaedu.sixthweek.saturday.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;
	private final ModelMapper modelMapper;
	private final ProductConverter productConverter;

	@Cacheable(value = "products", cacheManager = "defaultCacheManager", key = "#category")
	public List<ProductResponseDto> getListProduct(String category) {

		List<ProductResponseDto> productResponseDtos = new ArrayList<>();
		Iterable<Product> products = productRepository.findAllByCategory(category);
		for (Product product : products) {
			ProductResponseDto productResponseDto = modelMapper.map(product, ProductResponseDto.class);
			productResponseDtos.add(productResponseDto);
		}
		return productResponseDtos;

	}


	/**
	 * bu method kullanılarak cache put işlemi gerçekleştirilmiş olur.
	 *
	 * @return
	 */
	@CachePut(value = "products", cacheManager = "", key = "#category")
	public List<ProductResponseDto> getListProductPut(String category) {

		List<ProductResponseDto> productResponseDtos = new ArrayList<>();
		Iterable<Product> products = productRepository.findAllByCategory(category);
		for (Product product : products) {
			ProductResponseDto productResponseDto = modelMapper.map(product, ProductResponseDto.class);
			productResponseDtos.add(productResponseDto);

		}
		return productResponseDtos;

	}


	public Long save(ProductSaveRequestDto productSaveRequestDto) {
		Product product = productConverter.convertToProductFromProductRequestDto(productSaveRequestDto);
		Product save = productRepository.save(product);
		return save.getId();

	}
}

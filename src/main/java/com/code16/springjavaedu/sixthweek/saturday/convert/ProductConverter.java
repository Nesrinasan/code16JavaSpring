package com.code16.springjavaedu.sixthweek.saturday.convert;

import com.code16.springjavaedu.sixthweek.saturday.dto.ProductSaveRequestDto;
import com.code16.springjavaedu.sixthweek.saturday.entity.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductConverter {

	private final ModelMapper modelMapper;

	public Product convertToProductFromProductRequestDto(ProductSaveRequestDto productSaveRequestDto) {
		return modelMapper.map(productSaveRequestDto, Product.class);
	}
}

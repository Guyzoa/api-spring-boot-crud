package com.example.dem.mapper;

import org.springframework.stereotype.Component;

import com.example.dem.dtos.ProductDto;
import com.example.dem.model.Product;

@Component
public class Mapper {
   
	
	
public ProductDto convertToDto(Product product) {
	  ProductDto productDto = new ProductDto(product.getName(),product.getPrice(),"");
	  productDto.setStringifyDate(product.getDateOfDestroy());
	  return productDto;
}
	
public  Product convertToEntity(ProductDto productDto) {
		return new Product(productDto.getName(),productDto.getPrice(),productDto.getParseDate());
		
}

}

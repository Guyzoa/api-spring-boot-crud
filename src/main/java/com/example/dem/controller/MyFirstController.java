package com.example.dem.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dem.dtos.ProductDto;
import com.example.dem.mapper.Mapper;
import com.example.dem.model.Product;
import com.example.dem.services.MyFirstService;

@RestController
public class MyFirstController {
    @Autowired
	MyFirstService myFirstService;
    @Autowired
    Mapper mapper;
    
	@GetMapping("/products")
	@ResponseBody
	List <ProductDto> getAllProducts() {

		 List<Product> prod =  (List<Product>) myFirstService.getAllProducts();
		 return prod.stream().map(mapper::convertToDto).collect(Collectors.toList());
		 
	}
	
	@GetMapping("/products/{id}")
	@ResponseBody
	ProductDto getProduct(@PathVariable Integer id) {
		return mapper.convertToDto(myFirstService.getProductById(id).get());
	}
	
	@PostMapping("/products")
	@ResponseBody
	ResponseEntity<ProductDto> saveNewProduct(@RequestBody ProductDto prod){
		  Product product = mapper.convertToEntity(prod);
		  product =  myFirstService.saveProduct(product);
		  
		  ProductDto productDto = mapper.convertToDto(product);
		  
		  return ResponseEntity.created(URI.create("/products/" + product.getId())).body(productDto);
		  //return productDto;
	}
	
	
}

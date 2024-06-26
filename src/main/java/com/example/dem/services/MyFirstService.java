package com.example.dem.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.dem.dtos.ProductDto;
import com.example.dem.exceptions.AppException;
import com.example.dem.model.Product;
import com.example.dem.repository.ProductRepository;



@Service
public class MyFirstService {

 @Autowired
 private ProductRepository productRepository;
 
  //private List<ProductDto> myProducts = new ArrayList<ProductDto>();
  
  public Iterable <Product> getAllProducts(){
	  //return myProducts;
	  return productRepository.findAll();
  }
  
 public Optional<Product> getProductById(Integer id) {
	 
	 return productRepository.findById(id);
	 
	  /*return products.stream().
			  filter(product -> id.equals(product.getId())).
			  findFirst().orElseThrow(()->new AppException("produit inexistant",HttpStatus.NOT_FOUND));*/
  }
 
 public Product saveProduct(Product product) {
	 
	 return productRepository.save(product);
	 
	/*    
	   this.myProducts.add(productDto)	;
	   return productDto;*/
	   
 }
}

package com.example.dem.model;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produit_id")
	private int productId;
	
	@Column(name = "nom")
	private String name; 
	
	@Column(name = "prix")
	private float price;
	
	@Column(name = "date_de_peremption")
	private LocalDate dateOfDestroy;
	
	public Product(String name, float price, LocalDate date) {
		this.name = name;
		this.price = price;
		this.dateOfDestroy = date;
	}
	


	public void setDateofDestroy(LocalDate date) {
		this.dateOfDestroy = date;
	}
	
	public LocalDate getDateOfDestroy() {
		return this.dateOfDestroy;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getId() {
		return this.productId;
	}
	
}

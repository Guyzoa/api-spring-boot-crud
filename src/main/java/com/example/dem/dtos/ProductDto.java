package com.example.dem.dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



/*@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter*/
public class ProductDto {

	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String name; 
	private float price;
	private String dateOfDestroy;
	
	
	public ProductDto(String name, float price, String date) {
		// TODO Auto-generated constructor stub
		  this.setName(name);
		  this.setPrice(price);
		 // this.setStringifyDate(date);
		  this.dateOfDestroy = date;
	}
	
	public void setStringifyDate(LocalDate date){
		this.dateOfDestroy = date.format(dateFormat);
	}
	
    public LocalDate getParseDate() {
    	 return LocalDate.parse(dateOfDestroy,dateFormat);
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDateOfDestroy() {
		return dateOfDestroy;
	}

	public void setDateOfDestroy(String dateOfDestroy) {
		this.dateOfDestroy = dateOfDestroy;
	}
	
	
}

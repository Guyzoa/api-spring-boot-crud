package com.example.dem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dem.services.MyFirstService;

@SpringBootApplication
public class CrudoperationApplication{

	@Autowired
	//private MyFirstService myFirstService;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudoperationApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println(myFirstService.getMyString());
		
	}*/

}

package com.example.reservltutservice;

import controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repository.ProductRepository;
import service.ProductService;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)

@ComponentScan(basePackageClasses = ProductRepository.class)
@ComponentScan(basePackageClasses = ProductController.class)
@ComponentScan(basePackageClasses = ProductService.class)
public class ReservlTutServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservlTutServiceApplication.class, args);
	}

}

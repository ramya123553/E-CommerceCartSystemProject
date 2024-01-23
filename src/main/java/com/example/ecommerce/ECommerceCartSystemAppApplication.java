package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class ECommerceCartSystemAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceCartSystemAppApplication.class, args);
	}

}

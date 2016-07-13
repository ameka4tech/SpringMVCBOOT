package com.springcustomer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Helps to Run On Embedded Tomcat
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

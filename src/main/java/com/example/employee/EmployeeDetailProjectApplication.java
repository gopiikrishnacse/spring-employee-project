package com.example.employee;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class EmployeeDetailProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailProjectApplication.class, args);
	}

}

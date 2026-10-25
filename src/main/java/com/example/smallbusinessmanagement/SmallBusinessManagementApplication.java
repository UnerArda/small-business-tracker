package com.example.smallbusinessmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.smallbusinessmanagement")
@EnableJpaRepositories(basePackages = "com.example.smallbusinessmanagement.repository")
public class SmallBusinessManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallBusinessManagementApplication.class, args);
	}

}

package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootDataOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataOpsApplication.class, args);
	}

}

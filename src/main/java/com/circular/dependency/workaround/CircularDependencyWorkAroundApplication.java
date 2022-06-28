package com.circular.dependency.workaround;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircularDependencyWorkAroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircularDependencyWorkAroundApplication.class, args);
	}

}

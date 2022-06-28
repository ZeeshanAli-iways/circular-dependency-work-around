package com.circular.dependency.workaround;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sample application which uses workaround to solve circular dependency.
 */
@SpringBootApplication
public class CircularDependencyWorkAroundApplication {

  public static void main(String[] args) {
    SpringApplication.run(CircularDependencyWorkAroundApplication.class, args);
  }

}

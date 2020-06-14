package com.singtel.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelSolutionHimaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelSolutionHimaniApplication.class, args);
	}

	@Autowired
	private void myMethod() {
		Solution.getAllDetails();
	}
}

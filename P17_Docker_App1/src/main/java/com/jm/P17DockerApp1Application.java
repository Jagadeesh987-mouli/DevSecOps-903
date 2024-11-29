package com.jm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P17DockerApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(P17DockerApp1Application.class, args);
		System.out.println("Docker standalone app");
	}

}

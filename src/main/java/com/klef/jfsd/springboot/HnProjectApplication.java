package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HnProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HnProjectApplication.class, args);
		System.out.println("H&N Project using SpringBoot MVC JPA");
	}

}

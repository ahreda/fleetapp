package com.spring.fleetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FleetappApplication {

	public static void main(String[] args) {

		SpringApplication.run(FleetappApplication.class, args);
		System.out.println("Hello to Fleet Management Application");
	}

}

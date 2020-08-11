package com.spring.fleetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FleetappApplication {

	public static void main(String[] args) {

		SpringApplication.run(FleetappApplication.class, args);
		System.out.println("Fleet Management Application ");

	}

}

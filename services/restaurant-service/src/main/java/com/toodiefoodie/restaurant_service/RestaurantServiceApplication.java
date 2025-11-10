package com.toodiefoodie.restaurant_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantServiceApplication {

	public static void main(String[] args) {

		Dotenv dotEnv = Dotenv.load();
		dotEnv.entries().forEach(e->System.setProperty(e.getKey(),e.getValue()));

		SpringApplication.run(RestaurantServiceApplication.class, args);
	}

}

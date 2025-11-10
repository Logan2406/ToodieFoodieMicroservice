package com.example.order_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApplication {

	public static void main(String[] args) {
		Dotenv dotEnv = Dotenv.load();
		dotEnv.entries().forEach(e-> System.setProperty(e.getKey(),e.getValue()));
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}

package com.toodiefoodie.user_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {

		//Loading the .env values in the context at the time of loading the application, so that we can use ${Property}
		Dotenv dotEnv = Dotenv.load();
		dotEnv.entries().forEach(e-> System.setProperty(e.getKey(),e.getValue()));


		SpringApplication.run(UserServiceApplication.class, args);
	}


}

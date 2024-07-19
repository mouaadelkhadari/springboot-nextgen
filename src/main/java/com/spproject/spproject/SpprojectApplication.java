package com.spproject.spproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/* @SpringBootApplication(
		scanBasePackages = {
				"com.spproject.spproject",
				"com.spproject.util"
		}
)
*/
@SpringBootApplication
public class SpprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello World");
		};
	}


}

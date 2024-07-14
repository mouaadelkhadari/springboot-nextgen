package com.spproject.spproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



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

}

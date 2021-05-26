package com.example.movie.recommendationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommendationServiceApplication.class, args);
	}

	//if user says comedy fetch comedy movies from movies table

}

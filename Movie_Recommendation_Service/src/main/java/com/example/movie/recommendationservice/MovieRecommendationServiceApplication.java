package com.example.movie.recommendationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@EnableEurekaClient
public class MovieRecommendationServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {return new RestTemplate(); }

	public WebClient.Builder getWebClientBuilder(){return WebClient.builder();}

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommendationServiceApplication.class, args);
	}

	//if user says comedy fetch comedy movies from movies table

}

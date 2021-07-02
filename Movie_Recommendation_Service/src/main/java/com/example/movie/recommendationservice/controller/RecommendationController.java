package com.example.movie.recommendationservice.controller;

//import com.example.movie.recommendationservice.models.Movie;
import com.example.movie.recommendationservice.models.Recommendation;
//import com.example.movie.recommendationservice.models.recommendItem;
import com.example.movie.recommendationservice.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

//    @RequestMapping("/{movieGenre}")
//    public Recommendation getUserRecommendation(@PathVariable("movieGenre") String movieGenre){
//        return new Recommendation(movieGenre,"Avengers");
//    }

}

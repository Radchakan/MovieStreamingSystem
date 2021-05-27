package com.example.moviecatalogservice.resources;

import com.example.moviecatalogservice.models.Catalogitem;
import com.example.moviecatalogservice.models.Movie;
import com.example.moviecatalogservice.models.Rating;
import com.example.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Catalog")
public class MovieCatalogResource {

    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;


    @RequestMapping("/{userId}")
    public List<Catalogitem> getCatalog(@PathVariable("userId") String userId){

//        RestTemplate restTemplate =new RestTemplate();
       UserRating ratings = restTemplate.getForObject("http://Ratings-data-service/ratingdata/users/"+userId, UserRating.class);

       return ratings.getUserRating().stream().map(rating -> {
           //single make call api un marsialing the object

           //for each movie id call movie info service and get details
           Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" +rating.getMovieId(), Movie.class);

//           Movie movie = webClientBuilder.build()
//                   .get()
//                   .uri("http://localhost:8082/movies/" +rating.getMovieId())
//                   .retrieve()
//                   .bodyToMono(Movie.class)  //convert into movie class
//                   .block();

           //put them all together
           return new Catalogitem(movie.getName(),"Test",rating.getRating());
       })
               .collect(Collectors.toList());




//        return Collections.singletonList(
//                new Catalogitem("Transformenrs","test",4)
//        );

    }
}

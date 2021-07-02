///package com.example.movie.recommendationservice.resources;


//import com.example.movie.recommendationservice.models.Movie;
//import com.example.movie.recommendationservice.models.Recommendation;
//import com.example.movie.recommendationservice.models.recommendItem;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.Collections;
//import java.util.List;

//@RestController
//@RequestMapping("/recommendation")
//public class RcommendationResource {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private WebClient.Builder webClientBuilder;
//
//    @RequestMapping("/movieType")
//    public List<Recommendation> getRecommandation(@PathVariable("movieType") String movieType){
//        Movie movie =restTemplate.getForObject("movie-recommandation-service/recommendation/"+movieType,Movie.class);
//        return new Collections.singletonList(new Recommendation("comedy",movie.getName()));
//    }

//    @RequestMapping("/{movieGenre}")
//    public Recommendation getuserRecommendation(@PathVariable("movieGenre") String movieGenre){
//        return new Recommendation(movieGenre,"Avengers");
//    }
//    @RequestMapping("/{movieGenre}")
//    public Recommendation getuserRecommendation(@PathVariable("movieGenre") String movieGenre){
//        return new Recommendation(movieGenre, "Avengers");
//    }

//}

package com.example.movie.recommendationservice.resources;


import com.example.movie.recommendationservice.models.Recommendation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendation")
public class RcommendationResource {

    @RequestMapping("/{movieType}")
    public Recommendation getuserRecommendation(@PathVariable("movieType") String movieType){
        return new Recommendation(movieType,"Avengers");
    }

}

package com.example.movie.recommendationservice.models;

public class Recommendation {
    private String movieType;
    private  String movieName;

    public Recommendation(String movieType, String movieName) {
        this.movieType = movieType;
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}

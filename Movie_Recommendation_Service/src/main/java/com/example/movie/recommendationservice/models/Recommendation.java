package com.example.movie.recommendationservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "recommendation")
public class Recommendation implements Serializable {

    @Id
    private String movieId;
    private String movieGenre;
    private  String movieName;

    public Recommendation(String movieId, String movieGenre, String movieName) {
        this.movieId = movieId;
        this.movieGenre = movieGenre;
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "movieId='" + movieId + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}

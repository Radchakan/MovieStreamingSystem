package com.example.movieinfoservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private String movieId;
    private String name;
    private String year;
    private String duration;

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public Movie(String movieId, String year, String duration) {
        this.movieId = movieId;
        this.year = year;
        this.duration = duration;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

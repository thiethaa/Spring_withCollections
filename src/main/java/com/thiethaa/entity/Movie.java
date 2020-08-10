package com.thiethaa.entity;

public class Movie {
    private String movie;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }


    @Override
    public String toString() {
        return " Movie : " + movie +"\n";
    }
    void  info(){
        this.toString();
    }
}

package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    @Test
    public void testMovieTitle(){
        Film titleOfMovie = new Film ( "Ironman, Age of Ultron","Ironman fights robots",2017,1,188,"PG");
        assertEquals("Movie title not found", "Ironman, Age of Ultron", titleOfMovie.getTitle());
    }

    @Test
    public void testYearOfRelease() {
        Film yearOfRelease = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Try another year", 2017, yearOfRelease.getRelease_year());
    }

    @Test
    public void durationOfMovie() {
        Film duration = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Movie with that duration not found", 188, duration.getDuration());
    }

    @Test
    public void ratingOfMovie() {
        Film rating = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Movie with that duration not found", 8, rating.getRating());
    }

    @Test
    public void testRating() {
        Film rating = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("movie with that rating not found", 8, rating.getRating());
    }
}

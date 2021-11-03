package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    @Test
    public void testMovieTitle(){
        Film titleOfMovie = new Film (1001, "Ironman, Age of Ultron","Ironman fights robots",2017,1,188,"PG");
        assertEquals("Movie title not found", "Ironman, Age of Ultron", titleOfMovie.getTitle());
    }

    @Test
    public void testYearOfRelease() {
        Film yearOfRelease = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Try another year", 2017, yearOfRelease.getRelease_year());
    }

    @Test
    public void durationOfMovie() {
        Film duration = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Movie with that duration not found", 188, duration.getDuration());
    }

    @Test
    public void ratingOfMovie() {
        Film rating = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Movie with that duration not found", "PG", rating.getRating());
    }

    @Test
    public void testFilmId() {
        Film filmId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Please insert valid ID", 1001, filmId.getFilm_id());
    }

    @Test
    public void testLanguageId() {
        Film languageId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Please insert valid language ID", 1, languageId.getLanguage());
    }

    @Test
    public void testDescription() {
        Film description = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals("Description is not correct", "Ironman fights robots", description.getDescription());
    }
}

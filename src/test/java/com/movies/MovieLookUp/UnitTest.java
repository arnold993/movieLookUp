package com.movies.MovieLookUp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    public void testMovieTitle(){
        Film titleOfMovie = new Film (1001, "Ironman, Age of Ultron","Ironman fights robots",2017,1,188,"PG");
        assertEquals( "Ironman, Age of Ultron", titleOfMovie.getTitle(), "Title not correct");
    }

    @Test
    public void testYearOfRelease() {
        Film yearOfRelease = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(2017, yearOfRelease.getRelease_year(), "Choose another year");
    }

    @Test
    public void durationOfMovie() {
        Film duration = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(188, duration.getDuration(), "Duration too short");
    }

    @Test
    public void ratingOfMovie() {
        Film rating = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( "PG", rating.getRating(), "Wrong rating");
    }

    @Test
    public void testFilmId() {
        Film filmId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( 1001, filmId.getFilm_id(),"Wrong ID");
    }

    @Test
    public void testLanguageId() {
        Film languageId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(1, languageId.getLanguage(), "Choose right language");
    }

    @Test
    public void testDescription() {
        Film description = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( "Ironman fights robots", description.getDescription(), "Wrong description");
    }
}

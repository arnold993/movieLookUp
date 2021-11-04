package com.movies.movielookup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//Getters tests
public class UnitTest {
    @Test
    public void testMovieTitle(){
        Film titleOfMovie = new Film (1001, "Ironman, Age of Ultron","Ironman fights robots",2017,1,188,"PG");
        assertEquals( "Ironman, Age of Ultron", titleOfMovie.getTitle(), "Title not correct");
    }

    @Test
    public void testYearOfRelease() {
        Film yearOfRelease = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(2017, yearOfRelease.getReleaseYear(), "Choose another year");
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
        assertEquals( 1001, filmId.getFilmId(),"Wrong ID");
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

    // Setters test
    @Test
    public void testSetTitle() {
        Film filmTitle = new Film();
        filmTitle.setTitle("New Age");
        assertEquals("New Age", "New Age", filmTitle.getTitle());
    }

    @Test
    public void testSetDescription() {
        Film filmDescription = new Film();
        filmDescription.setDescription("A love story");
        assertEquals("A love story","A love story",filmDescription.getDescription());
    }

    @Test
    public void testSetReleaseYear() {
        Film filmYearOfRelease = new Film();
        filmYearOfRelease.setReleaseYear(2021);
        assertEquals(2021,2021,filmYearOfRelease.getReleaseYear());
    }

    @Test
    public void testSetLanguageId() {
        Film languageId = new Film();
        languageId.setLanguage(2);
        assertEquals(2,2,languageId.getLanguage());
    }

    @Test
    public void testSetFilmId() {
        Film filmId = new Film();
        filmId.setId(1001);
        assertEquals(1001,1001,filmId.getFilmId());
    }

    @Test
    public void testSetFilmDuration() {
        Film filmDuration = new Film();
        filmDuration.setDuration(188);
        assertEquals(188,188,filmDuration.getDuration());
    }

    @Test
    public void testSetFilmRating() {
        Film filmRating = new Film();
        filmRating.setRating("PG");
        assertEquals("PG","PG",filmRating.getRating());
    }
}
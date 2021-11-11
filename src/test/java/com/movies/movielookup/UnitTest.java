package com.movies.movielookup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//Getters tests
public class UnitTest {

    @Test
    void testNewFilm(String title, String description, int year, int languageId, int duration, String rating){
        Film newFilm = new Film("Zorro", "Wild west legend", 1988, 1, 88, "10");
        assertEquals("Zorro");

    }
    @Test
    void testMovieTitle(){
        Film titleOfMovie = new Film (1001, "Ironman, Age of Ultron","Ironman fights robots",2017,1,188,"PG");
        assertEquals( "Ironman, Age of Ultron", titleOfMovie.getTitle(), "Title not correct");
    }

    @Test
    void testYearOfRelease() {
        Film yearOfRelease = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(2017, yearOfRelease.getReleaseYear(), "Choose another year");
    }

    @Test
    void durationOfMovie() {
        Film duration = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(188, duration.getDuration(), "Duration too short");
    }

    @Test
    void ratingOfMovie() {
        Film rating = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( "PG", rating.getRating(), "Wrong rating");
    }

    @Test
    void testFilmId() {
        Film filmId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( 1001, filmId.getFilmId(),"Wrong ID");
    }

    @Test
    void testLanguageId() {
        Film languageId = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals(1, languageId.getLanguage(), "Choose right language");
    }

    @Test
    void testDescription() {
        Film description = new Film(1001, "Ironman, Age of Ultron", "Ironman fights robots", 2017, 1, 188, "PG");
        assertEquals( "Ironman fights robots", description.getDescription(), "Wrong description");
    }

    // Setters test
    @Test
    void testSetTitle() {
        Film filmTitle = new Film();
        filmTitle.setTitle("New Age");
        assertEquals("New Age", "New Age", filmTitle.getTitle());
    }

    @Test
    void testSetDescription() {
        Film filmDescription = new Film();
        filmDescription.setDescription("A love story");
        assertEquals("A love story","A love story",filmDescription.getDescription());
    }

    @Test
    void testSetReleaseYear() {
        Film filmYearOfRelease = new Film();
        filmYearOfRelease.setReleaseYear(2021);
        assertEquals(2021,2021,filmYearOfRelease.getReleaseYear());
    }

    @Test
    void testSetLanguageId() {
        Film languageId = new Film();
        languageId.setLanguage(2);
        assertEquals(2,2,languageId.getLanguage());
    }

    @Test
    void testSetFilmId() {
        Film filmId = new Film();
        filmId.setId(1001);
        assertEquals(1001,1001,filmId.getFilmId());
    }

    @Test
    void testSetFilmDuration() {
        Film filmDuration = new Film();
        filmDuration.setDuration(188);
        assertEquals(188,188,filmDuration.getDuration());
    }

    @Test
    void testSetFilmRating() {
        Film filmRating = new Film();
        filmRating.setRating("PG");
        assertEquals("PG","PG",filmRating.getRating());
    }


}

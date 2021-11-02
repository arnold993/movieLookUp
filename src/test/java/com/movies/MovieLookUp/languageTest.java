package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class languageTest {
    @Test
    public void testRating() {
        Film rating = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, "English", 188, 8);
        assertEquals("movie with that rating not found", 8, rating.getRating());
    }
}

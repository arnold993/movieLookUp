package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RatingTest {
    @Test
    public void ratingOfMovie() {
        Film rating = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, "English", 188, 8);
        assertEquals("Movie with that duration not found", 8, rating.getRating());
    }
}

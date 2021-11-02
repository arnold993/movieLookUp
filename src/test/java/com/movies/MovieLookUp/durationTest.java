package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class durationTest {
    @Test
    public void durationOfMovie() {
        Film duration = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, "English", 188, 8);
        assertEquals("Movie with that duration not found", 188, duration.getDuration());
    }
}

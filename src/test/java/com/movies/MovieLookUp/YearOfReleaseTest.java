package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearOfReleaseTest {
    @Test
    public void testYearOfRelease() {
        Film yearOfRelease = new Film("Ironman, Age of Ultron", "Ironman fights robots", 2017, "English", 188, 8);
        assertEquals("Try another year", "2017", yearOfRelease.getTitle());
    }
}

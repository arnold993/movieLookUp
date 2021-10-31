package com.movies.MovieLookUp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleTest {
    @Test
    public void testMovieTitle(){
        Film titleOfMovie = new Film ( "Ironman, Age of Ultron","Ironman fights robots",2017,"English",188,8);
        assertEquals("Movie title not found", "Ironman, Age of Ultron", titleOfMovie.getTitle());
    }
}

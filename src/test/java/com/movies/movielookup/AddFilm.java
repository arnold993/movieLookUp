package com.movies.movielookup;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class AddFilm {

    @Autowired
    private FilmRepository filmRepository;
    private Film nameOfFilm;

}

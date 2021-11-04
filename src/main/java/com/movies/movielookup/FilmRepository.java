package com.movies.movielookup;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Query("SELECT f FROM Film f WHERE f.title LIKE %:title%")
    List<Film> searchByTitle(@Param("title")String title);

}
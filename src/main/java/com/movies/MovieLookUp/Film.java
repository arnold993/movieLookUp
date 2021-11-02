package com.movies.MovieLookUp;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    private String title;
    private String description;
    private int release_year;
    private String language;
    private int duration;
    private int rating;

    public Film (String title, String description, int release_year, String language, int duration, int rating){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language = language;
        this.duration = duration;
        this.rating = rating;
    }

    public Film() {

    }

    public String getTitle() { return title;}
    public void  setTitle(String title) {this.title = title;}

    public String getDescription() { return description;}
    public void  setDescription(String description) {this.description = description;}

    public int getRelease_year() { return release_year;}
    public void  setRelease_year(int release_year) {this.release_year = release_year;}

    public String getLanguage() { return language;}
    public void  setLanguage(String language) {this.language = language;}

    public int getDuration() { return duration;}
    public void  setDuration(int duration) {this.duration = duration;}

    public int getRating() { return rating;}
    public void  setRating(int rating) {this.rating = rating;}

    public int getFilm_id() { return film_id;}
    public void setId(int id) {
        this.film_id = id;
    }


  /*  public String getJsonObjectOfFilm() {
        return "{" +
                "\"Title\" : \" " + title + "\"," +
                "\" Description\" : \" " + description + "\"" +
                "\" Year of release\" : \" " + release_year + "\"" +
                "\" Language of movie\" : \" " + language + "\"" +
                "\" Duration\" : \" " + duration + "\"" +
                "\" Rating\" : \" " + rating + "\"" +
                "}";
    }

   */

}

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
    private int language_id;
    private int duration;
    private String rating;

    public Film (String title, String description, int release_year, int language_id, int duration, String rating){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.duration = duration;
        this.rating = rating;
    }
//Default constructor
    public Film() {

    }

    public String getTitle() { return title;}
    public void  setTitle(String title) {this.title = title;}

    public String getDescription() { return description;}
    public void  setDescription(String description) {this.description = description;}

    public int getRelease_year() { return release_year;}
    public void  setRelease_year(int release_year) {this.release_year = release_year;}

    public int getLanguage() { return language_id;}
    public void  setLanguage(int language) {this.language_id = language;}

    public int getDuration() { return duration;}
    public void  setDuration(int duration) {this.duration = duration;}

    public String getRating() { return rating;}
    public void  setRating(String rating) {this.rating = rating;}

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

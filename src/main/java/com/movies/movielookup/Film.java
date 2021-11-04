package com.movies.movielookup;
import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="film_id")
    private int filmId;

    private String title;

    private String description;

    @Column(name="release_year")
    private int releaseYear;

    @Column(name="language_id")
    private int languageId;

    private int duration;
    private String rating;

    public Film (int film_id, String title, String description, int releaseYear, int languageId, int duration, String rating){
        this.filmId= film_id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
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

    public int getRelease_year() { return releaseYear;}
    public void  setRelease_year(int release_year) {this.releaseYear = release_year;}

    public int getLanguage() { return languageId;}
    public void  setLanguage(int language) {this.languageId = language;}

    public int getDuration() { return duration;}
    public void  setDuration(int duration) {this.duration = duration;}

    public String getRating() { return rating;}
    public void  setRating(String rating) {this.rating = rating;}

    public int getFilm_id() { return filmId;}
    public void setId(int id) {
        this.filmId = id;
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

package ch.hearc.ig.odi.personmovie.business;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Movie> seenMovies;

    public Person() {
        this.seenMovies = new ArrayList<>();
    }

    public Person(Long id, String firstName, String lastName) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getSeenMovies() {
        return seenMovies;
    }

    public void setSeenMovies(List<Movie> seenMovies) {
        this.seenMovies = seenMovies;
    }

    public void addMovie(Movie movie) {
        this.seenMovies.add(movie);
    }
}

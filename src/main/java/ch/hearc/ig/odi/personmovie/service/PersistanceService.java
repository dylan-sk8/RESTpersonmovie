package ch.hearc.ig.odi.personmovie.service;

import ch.hearc.ig.odi.personmovie.business.Movie;
import ch.hearc.ig.odi.personmovie.business.Person;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class PersistanceService {
    private Map<Long, Person> people;
    private Map<Long, Movie> movies;

    public PersistanceService() {
        people = new HashMap<>();
        movies = new HashMap<>();
        generateMockData();
    }

//    @PostConstruct
//    public void init() {
//        people = new HashMap<>();
//        movies = new HashMap<>();
//        generateMockData();
//    }

    private void generateMockData() {
        Person p1 = new Person(1001L, "Carol", "Kaye");
        Person p2 = new Person(1002L, "Mark", "Johnes");
        Person p3 = new Person(1003L, "Andrea", "Davis");
        Person p4 = new Person(1004L, "Zoe", "Smith");

        this.people.put(p1.getId(), p1);
        this.people.put(p2.getId(), p2);
        this.people.put(p3.getId(), p3);
        this.people.put(p4.getId(), p4);

        Movie m1 = new Movie(2001L, "La Ligne verte", "Frank Darabont");
        Movie m2 = new Movie(2002L, "La Liste de Schindler", "Steven Spielberg");
        Movie m3 = new Movie(2003L, "Le Parrain", "Francis Ford Coppola");
        Movie m4 = new Movie(2004L, "Gran Torino", "Clint Eastwood");
        Movie m5 = new Movie(2005L, "Pulp Fiction", "Quentin Tarantino");

        this.movies.put(m1.getId(), m1);
        this.movies.put(m2.getId(), m2);
        this.movies.put(m3.getId(), m3);
        this.movies.put(m4.getId(), m4);
        this.movies.put(m5.getId(), m5);

        p1.addMovie(m1);
        p1.addMovie(m2);

        p3.addMovie(m1);
        p3.addMovie(m2);
        p3.addMovie(m4);
        p3.addMovie(m5);

        p4.addMovie(m3);
    }

    public Person getPersonById(Long id) {
        return this.people.get(new Long(id));
    }

    public List<Person> getAllPeople() {
        return new ArrayList<>(this.people.values());
    }

    public void deletePersonById(Long id) {
        this.people.remove(new Long(id));
    }

    public Movie getMovieById(Long id) {
        return this.movies.get(new Long(id));
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(this.movies.values());
    }

    public void deleteMovieById(Long id) {
        this.movies.remove(new Long(id));
    }
}

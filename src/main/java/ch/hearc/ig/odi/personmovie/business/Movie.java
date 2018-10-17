package ch.hearc.ig.odi.personmovie.business;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private Long id;
    private String name;
    private String producer;
    private List<Person> people;

    public Movie() {
        this.people = new ArrayList<>();
    }

    public Movie(Long id, String name, String producer) {
        this();
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }
}

package models;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private List<Pet> pets;
    private long id;

    public User(String name, List<Pet> pets, long id) {
        this.name = name;
        this.pets = pets;
        this.id = id;
    }

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

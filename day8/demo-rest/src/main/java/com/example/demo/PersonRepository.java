package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonRepository {
    private List<Person> personList;

    public PersonRepository() {
        personList = new ArrayList<>();
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("Bert");
        p1.setAge(10);
        p1.setId(1);
        p2.setName("Ernie");
        p2.setAge(11);
        p2.setId(2);
        personList.add(p1);
        personList.add(p2);
    }

    public void addPerson(Person p) {
        personList.add(p);
    }

    public void deletePerson(long id) {
        Person p1 = personList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (p1 != null) {
            personList.remove(p1);
        }
    }

    public void updatePerson(Person p) {
        Person p1 = personList.stream().filter(person -> person.getId() == p.getId()).findFirst().orElse(null);
        if (p1 != null) {
            Person updatePerson = personList.get(personList.indexOf(p1));
            updatePerson.setName(p.getName());
            updatePerson.setAge(p.getAge());
        }
    }

    public List<Person> getPersons() {
        return personList;
    }

    public Optional<Person> getPersonById(long id) {
        return personList.stream().filter(person -> person.getId() == id).findFirst();
    }
}

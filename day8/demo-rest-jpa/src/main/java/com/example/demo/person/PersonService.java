package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // get all
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // get by id
    public Person getById(long id) {
        return personRepository.findById(id).orElse(null);
    }

    // post
    public Person savePerson(Person p) {
        return personRepository.save(p);
    }

    // delete
    public void deletePerson(long id) {
        personRepository.deleteById(id);
    }
}

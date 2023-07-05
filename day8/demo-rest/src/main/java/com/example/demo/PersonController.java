package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // get all
    @GetMapping
    public List<Person> getAll() {
        return personRepository.getPersons();
    }

    // get by id
    @GetMapping("{id}")
    public Person getById(@PathVariable long id) {
        return personRepository.getPersonById(id).orElse(null);
    }

    // add - post
    @PostMapping
    public void addPerson(@RequestBody Person p) {
        personRepository.addPerson(p);
    }

    // put
    @PutMapping
    public void updatePerson(@RequestBody Person p) {
        personRepository.updatePerson(p);
    }

    // delete
    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable long id) {
        personRepository.deletePerson(id);
    }
}

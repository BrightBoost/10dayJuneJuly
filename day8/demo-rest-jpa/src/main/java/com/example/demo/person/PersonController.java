package com.example.demo.person;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // get all
    @GetMapping
    public List<Person> getAll() {
        return personService.getAllPersons();
    }

    // get by id
    @GetMapping("{id}")
    public Person getPersonById(@PathVariable long id) {
        return personService.getById(id);
    }

    // post
    @PostMapping
    public Person addPerson(@RequestBody Person p) {
        return personService.savePerson(p);
    }

    // delete
    @DeleteMapping("{id}")
    public void deletePersonById(@PathVariable long id) {
        personService.deletePerson(id);
    }
}

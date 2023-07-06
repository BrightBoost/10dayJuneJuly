package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {
    private PersonService personService;

    @Autowired
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
    public ResponseEntity<Person> getPersonById(@PathVariable long id) {
        return new ResponseEntity<>(personService.getById(id), HttpStatus.OK);
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

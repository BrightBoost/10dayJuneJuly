package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Account {
    private Person person;

    @Autowired
    public Account(Person person) {
        this.person = person;
        System.out.println(this.person.getName());
    }

}

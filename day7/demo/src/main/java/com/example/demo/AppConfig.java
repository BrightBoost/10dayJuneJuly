package com.example.demo;

import com.example.demo.models.Address;
import com.example.demo.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person getPerson() {
        Person p = new Person(new Address());
        p.setName("Bobby");
        return p;
    }

}

package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {
    private HelloRepository helloRepository;

    @Autowired
    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    // get all
    public List<Hello> getAll() {
        return helloRepository.findAll();
    }

    // get by id
    public Hello getById(long id) {
        return helloRepository.findById(id).orElse(null);
    }

    // post
    public void saveHello(Hello hello) {
        helloRepository.save(hello);
    }
}

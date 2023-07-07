package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {

    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // get all
    @GetMapping
    public List<Hello> getAll() {
        return helloService.getAll();
    }

    // get specific
    @GetMapping("{id}")
    public Hello getHelloById(@PathVariable long id) {
        return helloService.getById(id);
    }

    // post
    @PostMapping
    public void addHello(@RequestBody Hello hello) {
        helloService.saveHello(hello);
    }
}

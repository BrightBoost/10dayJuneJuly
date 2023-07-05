package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("myfirst")
public class MyFirstController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello world!";
    }

    // path variable
    @GetMapping("hi/{name}")
    public String sayHi(@PathVariable String name) {
        return "Hi " + name;
    }

    // query param localhost:8080/myfirst/hello?name=blabla&hobby=lala
    @GetMapping("hello")
    public String sayHello(@RequestParam String name, @RequestParam String hobby) {
        return "Hello " + name + ". I like " + hobby + " too!";
    }

    @PostMapping
    public String greetPerson(@RequestBody Person p) {
        return "Welcome " + p.getName();
    }


}

package com.example.demo.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // create mocks
    @MockBean
    private HelloService helloService;

    // object mapper

    // set up some data
    private List<Hello> helloList;

    @BeforeEach
    public void setup() {
        Hello h1 = new Hello(1, "hi", LocalDate.now());
        Hello h2 = new Hello(2, "good day", LocalDate.now());
        Hello h3 = new Hello(3, "bye", LocalDate.now());

        helloList = new ArrayList<>();
        helloList.addAll(List.of(h1, h2, h3));

    }

    // get by id
    @Test
    public void whenGetWithExistingId_thenReturnHelloObject() {
        when(helloService.getById(1)).thenReturn(helloList.get(0));
        try {
            mockMvc.perform(get("/hello/{id}", 1))
                    .andExpect(jsonPath("$.description").value("hi"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

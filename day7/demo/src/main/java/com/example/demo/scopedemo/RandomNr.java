package com.example.demo.scopedemo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RandomNr {
    private int nr;

    public RandomNr() {
        nr = new Random().nextInt();
    }

    public int getNr() {
        return nr;
    }
}

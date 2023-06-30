package com.example.demo.scopedemo;

import org.springframework.stereotype.Component;

@Component
public class Jonas {
    private int goToValue;

    public Jonas(RandomNr nr) {
        this.goToValue = nr.getNr();

    }

    public int getGoToValue() {
        return goToValue;
    }

    public void setGoToValue(int goToValue) {
        this.goToValue = goToValue;
    }
}

package com.example.demo.scopedemo;

import org.springframework.stereotype.Component;

@Component
public class Gaia {
    private int goToValue;

    public Gaia(RandomNr nr) {
        this.goToValue = nr.getNr();
    }

    public int getGoToValue() {
        return goToValue;
    }

    public void setGoToValue(int goToValue) {
        this.goToValue = goToValue;
    }
}

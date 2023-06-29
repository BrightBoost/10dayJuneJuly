package models;

import java.util.List;

public class Cat extends Pet {
    private int nrOfLivesLeft;

    public int getNrOfLivesLeft() {
        return nrOfLivesLeft;
    }

    public Cat(String name, double weight, List<String> foodOptions) {
        super(name, weight, foodOptions);
    }

    public Cat() {

    }


    public void setNrOfLivesLeft(int nrOfLivesLeft) {
        this.nrOfLivesLeft = nrOfLivesLeft;
    }
    public void chaseBird() {
        System.out.println("chasing bird");
    }

    public void ruinCurtains() {
        System.out.println("with love though");
    }
}

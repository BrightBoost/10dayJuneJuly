package models;

import java.util.List;

public class Pet {
    private String name;
    private double weight;
    private List<String> foodOptions;

    public Pet(String name, double weight, List<String> foodOptions) {
        this.name = name;
        this.weight = weight;
        this.foodOptions = foodOptions;
    }

    public Pet() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public List<String> getFoodOptions() {
        return foodOptions;
    }

    public void setFoodOptions(List<String> foodOptions) {
        this.foodOptions = foodOptions;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }



}

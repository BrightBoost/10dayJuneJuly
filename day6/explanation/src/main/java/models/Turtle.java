package models;

public class Turtle extends Pet {

    // overriding
    @Override
    public void eat() {
        System.out.println("Turtle " + this.getName() + " is eating slowly...");
    }

    // overloading
    public void eat(String food) {
        System.out.println("Turtle " + this.getName() + " is eating " + food + " slowly...");
    }

    public void swim() {
        System.out.println("love the water");
    }
}

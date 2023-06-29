import models.Cat;
import models.Pet;
import models.Turtle;
import models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setNrOfLivesLeft(9);
        cat.setName("Roxy");
        cat.setWeight(7);
        cat.setFoodOptions(Arrays.asList("Fish", "anything human is eating"));

        Turtle turtle = new Turtle();
        turtle.setName("Doniatello");
        turtle.setWeight(1);
        turtle.setFoodOptions(Arrays.asList("cucumber", "turtlefood"));

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(turtle);
        pets.add(cat);
        User user = new User("20 yo Maaike", pets, 1);


        turtle.eat("salad");
        cat.eat();

        Pet p = new Cat(); // polymorphism
        p = new Turtle();
        p.eat();
//        Cat c = (Cat) new Pet(); classcastexception
    }
}

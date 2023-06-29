package explaininginterfaces;

public class Rabbit extends Animal implements Prey {
    public void hopAndBeSuperCute() {

    }

    @Override
    public void run() {
        System.out.println("hopping away real quick");
    }

    @Override
    public void hide() {
        System.out.println("down the rabbit hole");
    }
}

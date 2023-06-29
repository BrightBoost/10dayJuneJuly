package explaininginterfaces;

public class Snake extends Animal implements Predator, Prey {
    private boolean venomous;

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    @Override
    public void catchAndEat(Prey p) {
        // carefully cast p to animal
        if(p instanceof Animal a) {
            if(a.getWeight() > 10) {
                System.out.println("Too ambitious....");
            } else {
                System.out.println("Catching a " + p.getClass().getName());
            }
        }

    }

    @Override
    public void run() {
        System.out.println("snake is sliding away");
    }

    @Override
    public void hide() {
        System.out.println("snake is quickly hiding...");
    }
}

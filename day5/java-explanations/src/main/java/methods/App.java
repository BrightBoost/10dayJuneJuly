package methods;

import java.util.ArrayList;

public class App {

    private DoggyDaycare doggyDaycare;
    private void init() {
        doggyDaycare = new DoggyDaycare();

        Dog d1 = new Dog();
        d1.setName("Sluggie");
        d1.setWeight(13);

        Dog d2 = new Dog();
        d2.setName("Isabel");
        d2.setWeight(15);

        doggyDaycare.getDogList().add(d1);
        doggyDaycare.getDogList().add(d2);

    }

    public static void main(String[] args) {
       App app = new App();
       app.init();
       Dog firstDog = app.doggyDaycare.getDogList().get(0);
        System.out.println(firstDog.getName());

    }
}

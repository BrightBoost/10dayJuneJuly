package explaininginterfaces;

public class App {
    public static void main(String[] args) {
        Rabbit peter = new Rabbit();
        peter.run();
        peter.hide();
        peter.setWeight(15);

        Snake python = new Snake();
        python.catchAndEat(peter);
        python.hide();
    }
}

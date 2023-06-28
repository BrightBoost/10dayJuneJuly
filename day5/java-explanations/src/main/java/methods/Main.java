package methods;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Bobby");

        Dog dog2 = new Dog();
        dog2.setName("Isabel");

        dog1.bark();
        dog2.bark();

        int d1L = dog1.getLengthName();
        int d2L = dog2.getLengthName();

        System.out.println(d1L + d2L);

    }
}

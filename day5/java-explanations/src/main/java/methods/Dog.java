package methods;

public class Dog {
    private String name;
    private double weight;

    public void bark() {
        System.out.println("Woof says " + name);
    }

    public int getLengthName() {
        return name.length();
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
}

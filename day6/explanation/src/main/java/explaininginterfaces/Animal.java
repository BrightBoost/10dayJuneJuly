package explaininginterfaces;

public class Animal {
    private double weight;
    private String color;
    private boolean furry;
    private String genus;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFurry() {
        return furry;
    }

    public void setFurry(boolean furry) {
        this.furry = furry;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}

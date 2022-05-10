package Unterricht.Woche4.Interfaces.Logisticmanager;

public class Car implements Moveable {
    private String type;
    private String color;
    private double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(this + " wird nach " + destination + " gebracht.");
    }

    @Override
    public String toString() {
        return "Das Auto der Marke " + type + ", dem Gewicht " + weight +
                "t und der Farbe " + color;
    }
}

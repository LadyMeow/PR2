package Unterricht.Woche4.Interfaces.Logisticmanager;

public class Shirt implements Moveable{
    private String brand;
    private int size;
    private String color;

    public Shirt(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println(this + " wird nach " + destination + " gebracht.");
    }

    @Override
    public String toString() {
        return "Das Shirt mit der Marke " + brand + ", der Größe " + size +
                " und der Farbe " + color;
    }
}

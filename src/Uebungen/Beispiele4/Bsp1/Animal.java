package Uebungen.Beispiele4.Bsp1;

public class Animal {
    protected String color;
    protected int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public void walk() {
        System.out.println("The animal walks like");
    }

    public void makeNoise() {
        System.out.println("The animal sounds like");
    }
}

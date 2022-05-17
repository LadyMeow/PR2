package Uebungen.Beispiele4.Bsp1;

public class Cat extends Animal{
    protected String name;

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }
}

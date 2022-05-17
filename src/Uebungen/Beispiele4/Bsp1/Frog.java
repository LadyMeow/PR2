package Uebungen.Beispiele4.Bsp1;

public class Frog extends Animal{

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("springt");
    }

    @Override
    public void makeNoise() {
        System.out.println("quak");
    }
}

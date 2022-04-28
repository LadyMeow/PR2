package Unterricht.Woche4.Polymorphism;

public class Geige extends Instrument {

    public Geige(int lautstaerke, String n) {
        super(lautstaerke, n);
    }

    public int play() {
        System.out.println("Die Geige " + name + " wird gestrichen");
        return lautstaerke;
    }

}

package Unterricht.Woche4.AbstractClass;

public class Geige extends Instrument {

    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    public int play() {
        System.out.println("Geige wird gestrichen");
        return lautstaerke;
    }
}

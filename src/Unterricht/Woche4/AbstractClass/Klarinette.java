package Unterricht.Woche4.AbstractClass;

public class Klarinette extends Instrument {

    public Klarinette(int lautstaerke) {
        super(lautstaerke);
    }

    public int play() {
        System.out.println("Klarinette wird geblasen");
        return lautstaerke;
    }
}

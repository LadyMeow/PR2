package Unterricht.Woche4.Polymorphismus;

public class Klarinette extends Instrument {

    public Klarinette(int lautstaerke) {
        super(lautstaerke);
    }

    public int play() {
        System.out.println("Klarinette wird geblasen");
        return lautstaerke;
    }
}

package Unterricht.Woche4.AbstractClass;

public abstract class Instrument {
    public int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int play() {
        lautstaerke = 0;
        System.out.println("Kein Instrument wird gespielt");
        return lautstaerke;
    }

}

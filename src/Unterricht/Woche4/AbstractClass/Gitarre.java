package Unterricht.Woche4.AbstractClass;

public class Gitarre extends Instrument {

    public int play() {
        System.out.println("Gitarre wird gezupft");
        return lautstaerke;
    }

    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }
}

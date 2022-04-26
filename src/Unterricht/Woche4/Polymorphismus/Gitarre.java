package Unterricht.Woche4.Polymorphismus;

public class Gitarre extends Instrument {

    public int play() {
        System.out.println("Gitarre wird gezupft");
        return lautstaerke;
    }

    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }
}

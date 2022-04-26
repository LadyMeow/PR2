package Unterricht.Woche4.Polymorphismus;

public class Trompete extends Instrument {

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    public int play() {
        System.out.println("Trompete wird getrötet");
        return lautstaerke;
    }
}

package Unterricht.Woche4.Polymorphism;

public class Trompete extends Instrument {

    public Trompete(int lautstaerke, String n) {
        super(lautstaerke, n);
    }

    public int play() {
        System.out.println(name + " wird getrötet");
        return lautstaerke;
    }
}

package Unterricht.Woche4.Polymorphism;

public class Klarinette extends Instrument {

    public Klarinette(int lautstaerke, String n) {
        super(lautstaerke, n);
    }

    public int play() {
        System.out.println(name + " wird geblasen");
        return lautstaerke;
    }
}

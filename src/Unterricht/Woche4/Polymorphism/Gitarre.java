package Unterricht.Woche4.Polymorphism;

public class Gitarre extends Instrument {

    public int play() {
        System.out.println(name + " wird gezupft");
        return lautstaerke;
    }

    public Gitarre(int lautstaerke, String n) {
        super(lautstaerke, n);
    }
}

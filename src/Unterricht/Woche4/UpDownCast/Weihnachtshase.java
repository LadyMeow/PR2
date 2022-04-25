package Unterricht.Woche4.UpDownCast;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteiltGeschenke() {
        System.out.println(name + " verteilt Geschenke");
    }

    @Override
    public void hoppeln() {
        System.out.println(name + " hoppelt weihnachtlich");
    }
}

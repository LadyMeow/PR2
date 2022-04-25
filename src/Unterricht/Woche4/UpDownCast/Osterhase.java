package Unterricht.Woche4.UpDownCast;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    public void verstecktOstereier() {
        System.out.println(name + " versteckt Bio-Ostereier");
    }

    @Override
    public void hoppeln() {
        System.out.println(name + " hoppelt österlich");
    }
}

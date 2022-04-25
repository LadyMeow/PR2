package Unterricht.Woche4.UpDownCast;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> hasenstall;

    // constructor
    public Hasenstall() {
        hasenstall = new ArrayList<Hase>();
    }

    public void addHase(Hase a) {
        hasenstall.add(a);
    }

    // für jeden Hasen in hasenstall - hoppeln
    public void alleHoppeln() {
        for (Hase h : hasenstall) {
            h.hoppeln();
        }
    }

}

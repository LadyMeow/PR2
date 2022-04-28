package Unterricht.Woche4.UpDownCast;

import Unterricht.Woche4.Interfaces.GoesToParty;

public class Hase implements GoesToParty {
    public String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen(int stunden) {
        System.out.println(name + " schläft " + stunden + " Stunden.");
    }

    public void hoppeln() {
        System.out.println(name + " hoppelt");
    }

    public void fressen() {
        System.out.println(name + " frisst");
    }

    // implementiert von GoesToParty
    @Override
    public void party(String drink, String cake) {
        System.out.println(name + " goes to birthday party and eats " + cake + " and drinks " + drink);
    }
}

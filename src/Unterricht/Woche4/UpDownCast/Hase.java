package Unterricht.Woche4.UpDownCast;

public class Hase {
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

}

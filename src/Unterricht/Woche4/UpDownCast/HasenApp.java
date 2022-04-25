package Unterricht.Woche4.UpDownCast;

public class HasenApp {
    public static void main(String[] args) {
        Hase hoppel = new Osterhase("Hoppel Oster"); // up-casting -> auf Hase
        Hase hasi = new Weihnachtshase("Hasi Weihnacht"); // up-casting -> auf Hase

        // trotz Hase - Referenz wird die Osterhasen bzw. Weihnachtshasen hoppeln methode genommen
        hoppel.hoppeln();
        hoppel.schlafen(3);
        hasi.hoppeln();
        hasi.fressen();

        // down-casting:
        // jetzt funktionieren auch die Class spezifischen Methoden verstecktOstereier + verteiltGeschenke
        Osterhase oster1 = (Osterhase) hoppel;
        oster1.verstecktOstereier();

        Weihnachtshase weihnacht1 = (Weihnachtshase) hasi;
        weihnacht1.verteiltGeschenke();

        Hasenstall alleHasen = new Hasenstall();
        alleHasen.addHase(hoppel);
        alleHasen.addHase(hasi);

        System.out.println();
        System.out.println("**** Was machen alle Hasen im Hasenstall? ****");
        alleHasen.alleHoppeln();

    }
}

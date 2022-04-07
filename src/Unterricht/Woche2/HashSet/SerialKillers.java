package Unterricht.Woche2.HashSet;

import java.util.HashSet;

public class SerialKillers {
    // als angehende/r neuer SerienkillerIn (also Personen die viele Serien schauen)
    // sie möchten einen eindeutigen Nickname

    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        // Reihenfolge gibt es bei HashSet nicht
        for (String s : serialNicknames) {
            System.out.println(s);
        }

        System.out.println("add " + serialNicknames.add("Ted Bundy")); // false, weil Ted Bundy gibt es schon in dem HashSet. wird nicht hinzugefügt
        System.out.println("add " + serialNicknames.add("Edmund Kemper"));// wird hinzugefügt
        System.out.println("add " + serialNicknames.add("Jack the Ripper"));
        for (String s : serialNicknames) {
            System.out.println(s);
        }

        // serialNicknames.retain
        // zweites set nur für amerikaner*innen
        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Hannibal Lecter");
        americanSerialKiller.add("Edmund Kemper");
        System.out.println("************");

        // jetzt haben wir 2 Mengen (für Mengenoperationen)
        // z.B. retainAll - Schnittmenge (es bleiben nur diese Namen in serialNickname, welche in beiden Mengen vorkommt)
        serialNicknames.retainAll(americanSerialKiller);
        for (String s : serialNicknames) {
            System.out.println(s);
        }

    }

}

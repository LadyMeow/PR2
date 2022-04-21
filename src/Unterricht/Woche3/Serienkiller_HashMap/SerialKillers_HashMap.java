package Unterricht.Woche3.Serienkiller_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SerialKillers_HashMap {
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

        // hashMap erstellen
        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        // schnell ArrayLists für jeden Killer erstellen
        for(String crazyAmerican : americanSerialKiller) {
            ArrayList<String> o = new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");
            o.add("Opfer 3");

            opfer.put(crazyAmerican, o); // jeder Serienkiller hat eine eigene Opferliste
        }

        // Wie kann ich ein neues Opfer hinzufügen?
        // opfer in die Opferliste hinzufügen
        // Ted Bundy soll weitere 2 Opfer bekommen. das geht auf zwei wege
        // auf eine Referenz (opfi)
        ArrayList<String> opfi = opfer.get("Ted Bundy");
        opfi.add("Opfer 4");

        // oder direkt in die hashMap
        opfer.get("Ted Bundy").add("Opfer 5");

        System.out.println(opfer);

    }

}

package Unterricht.Woche1;

public class Osterhase {
    private int anzahlVersteckteEier;
    private String name;
    private int haeschenNummer;
    private static int haeschenZaehler = 1; // diesen Zähler gibt es 1x egal wieviele Häschen ich erstelle
    // statische Attribute gehören zur Klasse
    private HasenReligion_Enum persoehnlicherGlaube;

//    public void aendereAnzahlEier(int anzahlVersteckteEier) { // selbst gebastelter setter
//        // ich kann sicherstellen, dass kein blödsinn gemacht wird
//        if (anzahlVersteckteEier >= 0) {
//
//            // lokale variable oder parameter mit gleichem Namen werden bevorzugt
//            // anzahlVersteckteEier --> parameter
//            // this referenz zeigt auf die aktuelle Instanz (das aktuelle Attribut in der Klasse)
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }

    // methoden überladen - unterscheidet sich durch typ/anzahl der parameter
    // hier haben wir eine ohne Parameter -> dann soll Osterhase ein Dutzend Eier verstecken
//    public void aendereAnzahlEier() {
//        // hier geht es ohne this (weil kein parameter mit dem gleichen Namen übergeben wird)
//        anzahlVersteckteEier = 12;
//    }

//    public int gibMirAnzahlDerVerstecktenEier() { // selbst gebastelter getter
//        return anzahlVersteckteEier;
//    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if(anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Osterhase(int anzahlVersteckteEier, String name, HasenReligion_Enum glaube) {
        this.anzahlVersteckteEier = anzahlVersteckteEier;
        this.name = name;
        haeschenNummer = haeschenZaehler++; // jeder Osterhase soll eine eigene eindeutige Nummer haben
        persoehnlicherGlaube = glaube;
    }

    public Osterhase(String name) {
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler++;
        persoehnlicherGlaube = HasenReligion_Enum.LANGE_OHREN_ZEUGEN; // standard Glaube, wenn kein Glaube angegeben wird
    }

    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    @Override
    public String toString() {
        return name + " versteckte " + anzahlVersteckteEier + " Eier und glaubt an: " + persoehnlicherGlaube;
    }

}

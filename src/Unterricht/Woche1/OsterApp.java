package Unterricht.Woche1;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase(77,"Dieter", HasenReligion_Enum.ZUR_HEILIGEN_KAROTTE);
        Osterhase hansi = new Osterhase("Hansi"); // zweiter Konstruktor, hier wird nur der Name benötigt (anzahlVersteckteEier ist lt. Konstruktor dann 0)

//        ohne Konstruktor:
//        dieter.setName("Dieter");
//        dieter.setAnzahlVersteckteEier(77);
//        usw.

        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getHaeschenNummer());

        System.out.println("Hansi: " + hansi.getAnzahlVersteckteEier());
        hansi.setAnzahlVersteckteEier(10);
        System.out.println("Hansi: " + hansi.getAnzahlVersteckteEier());
        System.out.println("Hansi Nummer: " + hansi.getHaeschenNummer());

        dieter.setAnzahlVersteckteEier(-3); // macht er nicht, weil if in der methode (keine negativen Zahlen)
        System.out.println(dieter.getAnzahlVersteckteEier());

        // möchte 1 ei zu der bisherigen summe addieren

        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());

        // toString methode in OsterApp
        System.out.println(dieter);
        System.out.println(hansi);

    }
}

package Unterricht.Woche4.AbstractClass;

public class DemoOrchester {
    public static void main(String[] args) {
        Orchester o = new Orchester();

        Gitarre g = new Gitarre(2);
        Trompete t = new Trompete(10);
        Geige ge = new Geige(4);
        Klarinette k = new Klarinette(6);

        // Instrument Objekt erstellen nicht möglich, weil abstrakte Klasse
        // upcasting geht aber weiterhin

        o.add(g);
        o.add(t);
        o.add(ge);
        o.add(k);

        System.out.println("Lautstärke vom Orchester: " + o.playAll());

    }
}

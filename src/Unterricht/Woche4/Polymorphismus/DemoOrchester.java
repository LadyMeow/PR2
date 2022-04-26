package Unterricht.Woche4.Polymorphismus;

public class DemoOrchester {
    public static void main(String[] args) {
        Orchester o = new Orchester();

        Gitarre g = new Gitarre(2);
        Trompete t = new Trompete(10);
        Geige ge = new Geige(4);
        Klarinette k = new Klarinette(6);

        o.add(g);
        o.add(t);
        o.add(ge);
        o.add(k);

        System.out.println("Lautstärke vom Orchester: " + o.playAll());

    }
}

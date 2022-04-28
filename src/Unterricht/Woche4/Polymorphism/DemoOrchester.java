package Unterricht.Woche4.Polymorphism;

public class DemoOrchester {
    public static void main(String[] args) {
        Orchester o = new Orchester();

        Gitarre g = new Gitarre(2, "Gitarre");
        Trompete t = new Trompete(10, "Trompete");
        Geige ge = new Geige(4, "Gugu");
        Klarinette k = new Klarinette(6, "Klarinette");

        o.add(g);
        o.add(t);
        o.add(ge);
        o.add(k);

        System.out.println("Lautstärke vom Orchester: " + o.playAll());

    }
}

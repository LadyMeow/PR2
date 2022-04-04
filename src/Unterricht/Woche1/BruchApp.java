package Unterricht.Woche1;

public class BruchApp {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(2, 4);
        Bruch b3 = new Bruch(5, 10);

        System.out.println(b1); // Ausgabe mit toString methode
        System.out.println("Anzahl erstellter Brüche: " + Bruch.getNrFractions());
        System.out.println("*************");

        b1.print();
        System.out.println(" = ");
        System.out.println(b1.toDecimal());

        System.out.println("*************");
        System.out.println("Mulitplicate b1 with b2 and b3:");
        b1.multiplicate(b2, b3).print();

        System.out.println("*************");
        System.out.println("Add:");
        b1.add(b2).print();

        // ohne vorher initialisiertem Bruch
        System.out.println("*************");
        System.out.println("Mulitplicate b1 with new");
        b1.multiplicate(new Bruch(2, 5)).print();

        // jedes Multiplicate und add erzeugen einen neuen Bruch
        System.out.println("Anzahl erstellter Brüche: " + Bruch.getNrFractions());

    }
}

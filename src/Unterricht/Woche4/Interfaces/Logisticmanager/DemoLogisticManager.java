package Unterricht.Woche4.Interfaces.Logisticmanager;

public class DemoLogisticManager {
    public static void main(String[] args) {
        // so oder direkt
        Car c1 = new Car("VW", "rot", 1.5);
        Shirt s1 = new Shirt("Chanel", 36, "schwarz");

        LogisticManager logi = new LogisticManager();
        logi.add(c1);
        logi.add(s1);
        // direkt:
        logi.add(new Car("Skoda", "blau", 1.2));
        logi.add(new Shirt("H&M", 40, "rosa"));

        logi.moveAll("Graz");

    }
}

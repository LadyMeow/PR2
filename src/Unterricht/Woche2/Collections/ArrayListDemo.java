package Unterricht.Woche2.Collections;

import Unterricht.Woche1.HasenReligion_Enum;
import Unterricht.Woche1.Osterhase;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Osterhase> mauritius = new ArrayList<>(); // meine erste collection lebt

        Osterhase karl = new Osterhase(1000, "Karl von Karlingen", HasenReligion_Enum.EXTRA_BUNTE_OSTEREIER);
        Osterhase carla = new Osterhase(111, "Carla Kolumna", HasenReligion_Enum.ZUR_HEILIGEN_KAROTTE);
        Osterhase uschi = new Osterhase(7777, "Uschi mit den langen Ohren", HasenReligion_Enum.LANGE_OHREN_ZEUGEN);

        // fügen hinten elemente hinzu
        mauritius.add(karl);
        mauritius.add(carla);
        mauritius.add(uschi);

        // alle durchlaufen. 1. Variante
        for (int h = 0; h < mauritius.size(); h++) {
            System.out.println(mauritius.get(h));
        }

        // an welcher Stelle ist die carla?
        System.out.println(mauritius.indexOf(carla) + " Index von carla");

        // verwenden wir einen Iterator um über unsere Struktur zu iterieren. 3. Variante
        Iterator<Osterhase> iter = mauritius.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("***************************");

        // karl redet den ganzen Tag nur von der Jagd - wird von der Insel gejagt
        // entfernt objekt aus collection
        mauritius.remove(karl);

        // ist der karl wirklich weg? 2. Variante
        for (Osterhase oh : mauritius) {
            System.out.println(oh);
        }

        System.out.println("*******************");
        mauritius.add(1, karl); // karl darf wieder zurück

        for (int h = 0; h < mauritius.size(); h++) {
            System.out.println(mauritius.get(h));

        }


    }
}
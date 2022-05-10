package Unterricht.Woche5.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 120, true);
        Dog scooby2 = new Dog("ScoobyDoo", "black", 50, true);

        System.out.println(scooby);
        scooby.bark();

        //Dog hund = new Dog();
        //hund.bark();

        Beagle max = new Beagle("Max", "blue", 250, true, "Germknödel");
        System.out.println(max);
        max.bark();

        // Liste um das Sortieren zu testen
        ArrayList<Dog> dogArr = new ArrayList<>();
        dogArr.add(scooby);
        dogArr.add(scooby2);
        dogArr.add(max);
        dogArr.add((new Dog("Pupsi", "brown", 40, true)));

        System.out.println(dogArr);
        Collections.sort(dogArr);
        System.out.println(dogArr);
        System.out.println("*****************");

        // Beagle greift auch auf die compareTo methode in Dog zu!
        ArrayList<Beagle> beagleArr = new ArrayList<>();
        beagleArr.add(max);
        beagleArr.add(new Beagle("Bege", "blue", 30, false, "Keks"));

        System.out.println(beagleArr);
        Collections.sort(beagleArr);
        System.out.println(beagleArr);

    }
}

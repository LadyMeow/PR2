package Unterricht.Woche4.Interfaces.getClassStuff;

import Unterricht.Woche4.Vererbung.Beagle;
import Unterricht.Woche4.Vererbung.Dog;

public class SameNotSame {
    public static void main(String[] args) {

        // situation 1: check if class is exactly this class
        Beagle b = new Beagle("Doggo", "brown", 17, true, "Spaghetti");
        // here we know what is on it
        // but we are not sure, so test it

        System.out.println(b.getClass()); // was für eine Klasse bist du?
        System.out.println(Beagle.class); // was für eine Klasse bist du?

        if(b.getClass().equals(Beagle.class)){
            System.out.println("The same");
        }
        Object obj = b;

        System.out.println(obj.getClass()); // auch wenn die Referenz ein Object ist,
        // wird die Klasse vom Beagle ausgegeben. Prüft wirklich was drauf ist!

        if(obj.getClass().equals(Beagle.class)) {
            Beagle b2 = (Beagle)obj;
        }

        // situation 2: var instanceof Classname
        // here we are not interested in the exact type but if it is able to
        // do alle necessary stuff (this means I am the correct class, or a subclass, or
        // an interface implementing class)

        if(b instanceof Beagle) {
            System.out.println("yes");
        }
        if(b instanceof Dog) {
            System.out.println("yes");
        }
        if(obj instanceof Dog) {
            System.out.println("yes");
        }

        // er schaut wirklich was auf dem Objekt drauf ist
    }
}

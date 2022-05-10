package Unterricht.Woche5.Comparable;

public class Dog implements Comparable<Dog>{
    public String name;
    public int weight;
    public String eyeColor;
    public boolean appreciatesOtherDogs;

    //    public Dog(){
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weight = 17;
//        this.appreciatesOtherDogs = true;
//    }

    public Dog(String name, String eyeColor, int weight, boolean appreciatesOtherDogs){
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }
    public void bark(){
        System.out.println(name + " barks");
    }
    public void eat(){
        System.out.println(name + " eats");
        bark();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    // comparable methode
    // erstes Kriterium: nach Name
    // zweites Kriterium: nach Gewicht - kleinstes Gewicht zuerst
    // geht auch ohne this!
    @Override
    public int compareTo(Dog o) {
        if(this.name.compareTo(o.name) != 0) { // compareTo methode von String gibt Wert 1, -1 oder 0 zurück
            return this.name.compareTo(o.name); // nur wenn es unentschieden ist, schauen wir nach dem Gewicht
        }
        if(this.weight > o.weight) {
            return 1;
        }
        if(this.weight < o.weight) {
            return -1;
        }
        return 0;
    }
}

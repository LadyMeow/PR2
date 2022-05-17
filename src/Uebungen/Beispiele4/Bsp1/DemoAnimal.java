package Uebungen.Beispiele4.Bsp1;

public class DemoAnimal {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green", 2);
        Frog quaki = new Frog("green", 2);
        Dog doggo = new Dog("brown", 2, "doggo");
        Cat kitty = new Cat("black", 2, "kitty");

        Animal quaxiAsAnimal = quaxi;

        Frog quaxiAsFrogAgain = (Frog)quaxiAsAnimal;

        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise();
        quaxiAsFrogAgain.makeNoise();

        Nature nature = new Nature();
        nature.addAnimal(quaxi);
        nature.addAnimal(quaki);
        nature.addAnimal(doggo);
        nature.addAnimal(kitty);

        System.out.println(nature.countColor("green"));
    }
}

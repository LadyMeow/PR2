package Uebungen.Beispiele4.Bsp1;

import java.util.ArrayList;

public class Nature {
    protected ArrayList<Animal> tierListe = new ArrayList<>();

    public void addAnimal(Animal a) {
        tierListe.add(a);
    }

    public int countColor(String color) {
        int count = 0;

        for (Animal a : tierListe) {
            if(color.equals(a.color)) {
                count++;
            }
        }
        return count;
    }
}

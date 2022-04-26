package Unterricht.Woche4.AbstractClass;

import java.util.ArrayList;

public class Orchester {
    public ArrayList<Instrument> oInstruments;

    public Orchester() {
        oInstruments = new ArrayList<>();
    }

    public int playAll() {
        int sum = 0;

        for (Instrument i : oInstruments) {
            sum += i.play();
        }
        return sum;
    }

    public void add(Instrument i) {
        oInstruments.add(i);
    }

    @Override
    public String toString() {
        return "Orchester{" +
                "oInstruments=" + oInstruments +
                '}';
    }
}

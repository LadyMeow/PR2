package Uebungen.Beispiele3.Bsp1;

import Unterricht.Woche3.Account_HashMap.Account;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
    private ArrayList<Event> events = new ArrayList<>();

    public void add(Event e) {
        events.add(e);
    }

    public Event getByTitle(String title) {
        for (Event e : events) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        return null;
    }
    // Liefert das erste Event, das den übergebenen Titel aufweist retour

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                result.add(e);
            }
        }
        return result;
    }
    // Liefert alle Events, die im übergebenen Ort stattfinden, retour

    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        ArrayList<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getEintrittspreis() >= min && e.getEintrittspreis() <= max) {
                result.add(e);
            }
        }
        return result;
    }
    // Liefert alle Events, deren Eintrittspreise zwischen den übergebenen Werten min und
    // max liegen bzw. genau einem dieser beiden Werte entsprechen.

    public Event getMostExpensiveByOrt(String ort) {
        Event maxE = new Event(null, null, 0);
        double maxPrice = 0;
        for (Event e : events) {
            if (e.getOrt().equals(ort) && e.getEintrittspreis() > maxPrice) {
                maxE = e;
                maxPrice = e.getEintrittspreis();
            }
        }
        return maxE;
    }
    // Liefert das Event mit dem höchsten Eintrittspreis im übergebenen Ort.

    public double getAvgPreisByOrt(String ort) {
        int count = 0;
        double sum = 0;
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                count++;
                sum += e.getEintrittspreis();
            }
        }
        return sum / count;
    }
    // Liefert den durchschnittlichen Eintrittspreis der Events im übergebenen Ort

    public HashMap<String, Integer> getCountEventsByOrt() {
        HashMap<String, Integer> result = new HashMap<>();

        for (Event e : events) {
            result.put(e.getOrt(), 0);
        }

        for (String o : result.keySet()) {
            int count = 0;

            for (Event e : events) {
                if (o.equals(e.getOrt())) {
                    result.put(e.getOrt(), ++count);
                }
            }
        }

        return result;
    }

    public HashMap<String, Double> getSumPriceEventsByOrt() {
        HashMap<String, Double> result = new HashMap<>();

        for (Event e : events) {
            result.put(e.getOrt(), null);
        }

        for (String o : result.keySet()) {
            double sum = 0.0;

            for (Event e : events) {
                if (o.equals(e.getOrt())) {
                    result.put(e.getOrt(), (sum += e.getEintrittspreis()));
                }
            }
        }

        return result;
    }
    // Liefert in einer HashMap den Gesamtpreis aller Veranstaltungen je Ort.

    // oder so: (nur eine Schleife)
    public HashMap<String, Double> getSumPriceEventsByOrt2() {
        HashMap<String, Double> erg = new HashMap<String, Double>();

        for (Event e : events) {
            if (erg.containsKey(e.getOrt())) {
                // ort already in hashmap
                erg.put(e.getOrt(), e.getEintrittspreis() + erg.get(e.getOrt()));
            } else {
                // ort not in hashmap
                erg.put(e.getOrt(), e.getEintrittspreis());
            }
        }

        return erg;
    }

    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }
}

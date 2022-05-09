package Uebungen.Beispiele2.Bsp2;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> wasserstaende = new ArrayList<>();

    public void add(Wasserstand w) {
        wasserstaende.add(w);
    }

    public Wasserstand findById(int id) {
        for (Wasserstand w : wasserstaende) {
            if(w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList<Wasserstand> result = new ArrayList<>();
        for (Wasserstand w : wasserstaende) {
            if(w.getGewaesserName().equals(gewaesserName)) {
                result.add(w);
            }
        }
        return result;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        int maxSec = 0;
        Wasserstand maxW = new Wasserstand();
        for (Wasserstand w : wasserstaende) {
            if(gewaesserName.equals(w.getGewaesserName()) && w.getZeitpunkt() > maxSec) {
                maxSec = w.getZeitpunkt();
                maxW = w;
            }
        }
        return maxW;
    }

    public ArrayList<Wasserstand> findForAlarmierung() {
        ArrayList<Wasserstand> result = new ArrayList<>();

        for (Wasserstand w : wasserstaende) {
            if(w.getMessWert() >= w.getMessWertFuerAlarmierung()) {
                result.add(w);
            }
        }
        return result;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort) {
        double sum = 0;
        int count = 0;
        for (Wasserstand w : wasserstaende) {
            if(w.getOrt().equals(ort) && w.getGewaesserName().equals(gewaesserName)) {
                sum += w.getMessWert();
                count++;
            }
        }
        return sum / count;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort) {
        ArrayList<Wasserstand> result = new ArrayList<>();

        for (Wasserstand w : wasserstaende) {
            if(w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort) && w.getZeitpunkt() >= von && w.getZeitpunkt() <= bis) {
                result.add(w);
            }
        }
        return result;
    }

}

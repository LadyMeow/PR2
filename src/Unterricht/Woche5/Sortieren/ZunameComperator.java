package Unterricht.Woche5.Sortieren;

import java.util.Comparator;

public class ZunameComperator implements Comparator<MitarbeiterIn> {

    @Override
    public int compare(MitarbeiterIn o1, MitarbeiterIn o2) {
        return o1.getZname().compareTo(o2.getZname()); // wir bekommen 1, -1 oder 0 zurück, also schon das richtige Format
    }
}

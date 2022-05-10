package Unterricht.Woche5.Sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortierApp {
    public static void main(String[] args) {
        int[] intArr = {27, -12, 4, 29, 34};
        String[] strArr = {"Hansis Erste Hits", "Hansis Beste", "Hansis Neuestes Album", "Hansis Allerbeste"};
        MitarbeiterIn[] mrArr = {new MitarbeiterIn("Hansi", "Hinterseer", 1940),
                                 new MitarbeiterIn("Helene", "Fischer", 1970),
                                 new MitarbeiterIn("Andrea", "Berg", 1965)};

        List<MitarbeiterIn> mrList = new ArrayList<MitarbeiterIn>();
        mrList.add(mrArr[0]);
        mrList.add(mrArr[1]);
        mrList.add(mrArr[2]);
        // oder als eigene Funktion: (convert Array to List)
        List<MitarbeiterIn> mrList2 = Arrays.asList(mrArr);

        // int sortieren
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr); // vorhandene Sortierfunktion
        System.out.println(Arrays.toString(intArr));

        // Strings werden alphabetisch sortiert
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        // eigenes Objekt sortieren, geht nicht so einfach (er weiß nicht, nach was er sortieren soll) - in der Klasse MitarbeiterIn
        System.out.println(Arrays.toString(mrArr));
        Arrays.sort(mrArr);
        System.out.println(Arrays.toString(mrArr));

        // mit Collections
        System.out.println(mrList);
        Collections.sort(mrList);
        System.out.println(mrList);

        // ZunameComperator, damit ich versch. compare methoden machen kann!
        Collections.sort(mrList, new ZunameComperator());
        System.out.println(mrList);

    }
}

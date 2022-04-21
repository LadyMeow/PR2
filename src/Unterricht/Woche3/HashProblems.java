package Unterricht.Woche3;

public class HashProblems {
    public static void main(String[] args) {
        // zeigen, dass theoretisch unterschiedliche objekte gleichen hashcode haben können

        // bei HashMap oder HashSet brauchen wir immer die equals und die hashcode Methode

        String s1 = "VII";
        String s2 = "Ugh";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

}

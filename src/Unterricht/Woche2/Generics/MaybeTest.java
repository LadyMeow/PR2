package Unterricht.Woche2.Generics;


import Unterricht.Woche1.Account;

public class MaybeTest {
    public static void main(String[] args) {
        Maybe<Double> gehalt = new Maybe<>(5000.50, 2);
        gehalt.print();

        Maybe<Account> meinKonto = new Maybe<>(new Account("Elisabeth", "AT029887", "BAWATTA"), 1);
        meinKonto.print();

    }
}

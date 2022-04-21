package Unterricht.Woche1.Account_HashSet;

import java.util.HashSet;

// dazu gehört Klasse Account
public class Bank {
    public static void main(String[] args) {

        Account person1 = new Account("Hansi", "AT01234", "B01234");
        Account person2 = new Account("Bunny", "AT56789", "B56789");
        Account person3 = new Account("Fluffy", "AT543210", "B543210");
        // hat gleichen Iban um equals im HashSet zu testen
        Account person4 = new Account("Lulu", "AT543210", "B123745");

        person1.add(70);
        person2.add(200);
        person3.add(555.5);

        person1.deposit(20);
        person2.deposit(220);

        Account[] array = {person1, person2, person3};

        for (Account account : array) {
            System.out.println(account.getBalance());
        }
        
//        oder:
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i].getBalance());
//        }

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("*************");

        // HashSet erstellen (= eine Menge). Hat die Eigenschaft, dass jedes Objekt nur einmal darin sein darf
        // mit den Methoden hashCode und (falls wirklich gleich - equals) wird automatisch überprüft, ob das Objekt schon drin ist
        HashSet<Account> bank = new HashSet<>();
        System.out.println(bank.add(person1));
        System.out.println(bank.add(person2));
        System.out.println(bank.add(person3));
        System.out.println(bank.add(person4)); // dieser Account wurde nicht hinzugefügt, weil der Iban bereits vorhanden ist

    }


}

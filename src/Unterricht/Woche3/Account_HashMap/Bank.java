package Unterricht.Woche3.Account_HashMap;

import java.util.HashMap;
import java.util.HashSet;

// dazu gehört Klasse Account
public class Bank {
    public static void main(String[] args) {

        Account person1 = new Account("Dagobert", "AT01234", "B01234");
        Account person2 = new Account("Daisy", "AT56789", "B56789");
        Account person3 = new Account("Donald", "AT543210", "B543210");
        Account person4 = new Account("Lulu", "AT542211", "B123745");

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


        // HashMap Beispiel
        HashMap<String, Account> bank = new HashMap<>();

        bank.put("Dagobert", person1);
        bank.put("Daisy", person2);
        bank.put("Donald", person3);

        // gibt es einen Wert hinter dem Schlüssel Dagobert?
        System.out.println(bank.containsKey("Dagobert"));
        // Wert des Schlüssels Daisy ausgeben:
        System.out.println(bank.get("Daisy"));

        // einmal drüber iterieren -> achtung etwas anders!
        for(String owner : bank.keySet()) {
            System.out.print(owner + ": ");
            System.out.println(bank.get(owner));
        }
    }

}

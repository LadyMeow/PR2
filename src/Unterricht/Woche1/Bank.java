package Unterricht.Woche1;

// dazu gehört Klasse Account
public class Bank {
    public static void main(String[] args) {

        Account person1 = new Account("Hansi", "AT01234", "B01234");
        Account person2 = new Account("Bunny", "AT56789", "B56789");
        Account person3 = new Account("Fluffy", "AT543210", "B543210");

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
    }
}

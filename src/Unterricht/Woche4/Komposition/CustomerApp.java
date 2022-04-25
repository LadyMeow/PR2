package Unterricht.Woche4.Komposition;

public class CustomerApp {
    public static void main(String[] args) {
        Address a1 = new Address("Merangasse 51", "8010", "Graz", "AT");
        Address a2 = new Address("Bienengasse 16", "8020", "Graz", "AT");

        Customer c1 = new Customer(1);
        Customer c2 = new Customer(2);

        c1.addAddress(a1);
        c2.addAddress(a2);
        System.out.println(c1);
        System.out.println(c2);
    }
}

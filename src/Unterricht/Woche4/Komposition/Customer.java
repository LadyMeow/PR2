package Unterricht.Woche4.Komposition;

import java.util.ArrayList;

// Vererbung mit extends
public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;
    // oder: (macht keinen Unterschied)
    // private ArrayList<Address> addresses = new ArrayList<>();
    // und ohne Initialisierung im Constructor

    public Customer(int customerNumber, String firstName, String lastName) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    // method overwrite: (gleicher Methodenname in Person und Customer)
    // @Override hilft mir dabei, richtig Methoden zu überschreiben und nicht nur overload zu machen (z.B. mit unterschiedlichen Parameterangaben)
    public void doSomething() {
        System.out.println(firstName + " " + lastName + " isst Schokolade");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

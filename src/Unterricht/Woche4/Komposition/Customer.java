package Unterricht.Woche4.Komposition;

import java.util.ArrayList;

public class Customer {
    private int customerNumber;
    private ArrayList<Address> addresses;
    // oder: (macht keinen Unterschied)
    // private ArrayList<Address> addresses = new ArrayList<>();
    // und ohne Initialisierung im Constructor

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + customerNumber +
                ", Addresses=" + addresses +
                '}';
    }

}

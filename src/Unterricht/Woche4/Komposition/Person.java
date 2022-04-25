package Unterricht.Woche4.Komposition;

public class Person {
    public String firstName;
    public String lastName;

    public void doSomething() {
        System.out.println(firstName + " isst Schokolade.");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}

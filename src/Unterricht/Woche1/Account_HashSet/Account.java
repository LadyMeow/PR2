package Unterricht.Woche1.Account_HashSet;

import java.util.Objects;

// gehört zu Klasse Bank
public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
        accountID = uniqueID++;
    }

    public void add(double wert) {
        if(wert > 0) {
            balance += wert;
        }
    }

    public double deposit(double wert) { // hier wird der Wert zurückgegeben, den wir abgehoben haben
        if (wert > 0) {
            if (wert < balance) {
                balance -= wert;
            } else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }

}

package Uebungen.Beispiele4.Bsp2;

public class FixCommissionEmployee extends Employee{
    protected double additionalCommission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    public double getFullSalary() {
        return (baseSalary + additionalCommission);
    }
}

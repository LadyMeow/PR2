package Uebungen.Beispiele4.Bsp2;

public class PercentCommissionEmployee extends Employee{
    protected double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    public double getFullSalary() {
        return baseSalary + (baseSalary * percentCommission / 100);
    }
}

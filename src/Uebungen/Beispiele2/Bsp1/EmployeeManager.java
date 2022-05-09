package Uebungen.Beispiele2.Bsp1;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee e : employees) {
            if (number == e.getEmpNumber()) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (department.equals(e.getDepartment())) {
                result.add(e);
            }
        }
        return result;
    }

    public Employee findByMaxSalary() {
        double max = 0;
        Employee maxE = null;
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
                maxE = e;
            }
        }
        return maxE;
    }

}

package Unterricht.Woche2.HashMap;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>(); // or we do it in constructor

    // oder im constructor:
//    public EmployeeManager(ArrayList<Employee> employees) {
//        employees = new ArrayList<>();
//    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) { // alle mitarbeiter durchchecken
        for (Employee e : employees) {
            if (e.getEmpNumber() == number) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> inDepartment = new ArrayList<>(); // neue ArrayList, die alle Mitarbeiter, die in dem Department sind, speichert

        for (Employee e : employees) {
            if(e.getDepartment().equals(department)) {
                inDepartment.add(e);
            }
        }
        return inDepartment;
    }

    Employee findByMaxSalary() {
        double highestSalary = 0;
        Employee highestE = null;

        for (Employee e : employees) {
            if(e.getSalary() > highestSalary) {
                highestSalary = e.getSalary();
                highestE = e;
            }
        }
        return highestE;
    }

}

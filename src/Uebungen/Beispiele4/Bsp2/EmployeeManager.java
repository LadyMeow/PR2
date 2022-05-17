package Uebungen.Beispiele4.Bsp2;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    protected ArrayList<Employee> empList;

    public EmployeeManager() {
        empList = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        empList.add(e);
    }

    public double calcTotalSalary() {
        double sum = 0;

        for (Employee e : empList) {
            sum += e.getFullSalary();
        }

        return sum;
    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> map = new HashMap<>();

        for (Employee e : empList) { // department already in hashmap
            if(map.containsKey(e.department)) {
                map.put(e.department, e.getFullSalary() + map.get(e.department));
            } else { // department not in hashmap
                map.put(e.department, e.getFullSalary());
            }
        }

        return map;
    }
}

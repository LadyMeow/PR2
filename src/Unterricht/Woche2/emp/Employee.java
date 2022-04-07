package Unterricht.Woche2.emp;

import java.util.Objects;

public class Employee {
    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // methode um zu schauen, ob mitarbeiter im gleichen department arbeiten
    public boolean compareDepartment(Employee e) {
        if(department.equals(e.department)){
            return true;
        }
        return false;
    }

    // getter
    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString
    @Override
    public String toString() {
        return "EmployeeManager{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    // generate - equals & hashCode: (für empNr & department)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Objects.equals(department, employee.department);
    }

    // hashCode methode muss auf den gleichen Attributen basieren wie die equals methode
    @Override
    public int hashCode() {
        return Objects.hash(empNumber, department);
    }
}

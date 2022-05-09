package Uebungen.Beispiele2.Bsp1;

public class DemoEmp {
    public static void main(String[] args) {
        Employee nr1 = new Employee(1, "Hansi", 5000, "Musik");
        Employee nr2 = new Employee(2, "Gabi", 2500, "Büro");
        Employee nr3 = new Employee(3, "Rosi", 340000, "Musik");

        EmployeeManager mgr = new EmployeeManager(); // name unseres EmloyeeManagers

        mgr.addEmployee(nr1);
        mgr.addEmployee(nr2);
        mgr.addEmployee(nr3);

        System.out.println(mgr.findByDepartment("Musik"));
        System.out.println(mgr.findByMaxSalary());
        System.out.println(mgr.findByEmpNumber(1));
    }
}

package Unterricht.Woche2.emp;

public class DemoEmp {
    public static void main(String[] args) {

        Employee nr1 = new Employee(1, "Hansi", 5000, "Musik");
        Employee nr2 = new Employee(2, "Gabi", 2500, "Büro");
        Employee nr3 = new Employee(3, "Rosi", 340000, "Musik");

        EmployeeManager mgr = new EmployeeManager(); // name unseres EmloyeeManagers

        mgr.addEmployee(nr1);
        mgr.addEmployee(nr2);
        mgr.addEmployee(nr3);

        // mitarbeiter alle Infos ausgeben
        System.out.println(nr1);
        System.out.println("*******************");

        System.out.println("EMP Number 3: " + mgr.findByEmpNumber(3));
        System.out.println("Department Musik: " + mgr.findByDepartment("Musik"));

        System.out.println(mgr.findByMaxSalary());

    }
}

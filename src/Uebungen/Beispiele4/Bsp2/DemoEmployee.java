package Uebungen.Beispiele4.Bsp2;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hinti", "Hansi", "Musik", 2500);
        FixCommissionEmployee e2 = new FixCommissionEmployee("Rodgers", "Rabbit", "IT", 3000, 500);
        PercentCommissionEmployee e3 = new PercentCommissionEmployee("Bunny", "Bugs", "IT", 3000, 10);

        EmployeeManager empManager = new EmployeeManager();
        empManager.addEmployee(e1);
        empManager.addEmployee(e2);
        empManager.addEmployee(e3);

        System.out.println(empManager.calcTotalSalary());
        System.out.println(empManager.getSalaryByDepartment());
    }
}

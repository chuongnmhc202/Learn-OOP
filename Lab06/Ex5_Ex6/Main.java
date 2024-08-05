package Ex5_Ex6;

public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("E001", "John Doe", 2.5);
        Employee emp3 = new Employee("E002", "Jane Smith", 2018, 3.0, 2);

        // Creating Manager objects
        Manager mgr1 = new Manager();
        Manager mgr2 = new Manager("M001", "Alice Johnson", 3.5, "Finance Manager", 2.0);
        Manager mgr3 = new Manager("M002", "Bob Brown", 2015, 4.0, 1, "Operations Manager", 2.5);

        // Displaying information and calculating salaries
        System.out.println("Employee 1: " + emp1.fullName);
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println("Employee 2: " + emp2.fullName);
        System.out.println("Salary: " + emp2.getSalary());

        System.out.println("Employee 3: " + emp3.fullName);
        System.out.println("Salary: " + emp3.getSalary());

        System.out.println("Manager 1: " + mgr1.fullName);
        System.out.println("Salary: " + mgr1.getSalary());

        System.out.println("Manager 2: " + mgr2.fullName);
        System.out.println("Salary: " + mgr2.getSalary());

        System.out.println("Manager 3: " + mgr3.fullName);
        System.out.println("Salary: " + mgr3.getSalary());
    }
}


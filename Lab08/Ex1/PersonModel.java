package Ex1;

import java.util.ArrayList;

public class PersonModel<T> {
	private ArrayList<T> al = new ArrayList<>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }
    
    public static void main(String[] args) {
    	PersonModel<Student> studentModel = new PersonModel<>();
        studentModel.add(new Student("Alice", 2000, "S001", 8.5));
        studentModel.add(new Student("Bob", 2001, "S002", 7.5));
        System.out.println("Students:");
        studentModel.display();

        // Test for Employees
        PersonModel<Employee> employeeModel = new PersonModel<>();
        employeeModel.add(new Employee("Charlie", 1990, "E001", 3000.0));
        employeeModel.add(new Employee("Dave", 1985, "E002", 4000.0));
        System.out.println("Employees:");
        employeeModel.display();

        // Test for Persons
        PersonModel<Person> personModel = new PersonModel<>();
        personModel.add(new Person("Eve", 1975));
        personModel.add(new Person("Frank", 1980));
        System.out.println("Persons:");
        personModel.display();
	}

}

package Abtract_Student;

import java.util.ArrayList;

public class StudentProcess {
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : lstStu) {
            if (s.getRank().equals("A") || s.getRank().equals("Passed")) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ITStudent("Alice", 9, 1001));
        students.add(new ITStudent("Bob", 7, 1002));
        students.add(new MathStudent("Charlie", 5, "M001"));
        students.add(new MathStudent("Dave", 4, "M002"));

        StudentProcess sp = new StudentProcess();
        ArrayList<Student> topStudents = sp.findStudent(students);

        System.out.println("Top Students:");
        for (Student s : topStudents) {
            System.out.println(s);
        }
    }
}

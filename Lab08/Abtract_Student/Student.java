package Abtract_Student;

abstract class Student {
    protected String sName;
    protected double gpa;

    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public abstract String getRank();

    @Override
    public String toString() {
        return "Student{sName='" + sName + "', gpa=" + gpa + ", rank=" + getRank() + '}';
    }
}


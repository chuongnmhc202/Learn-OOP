package Abtract_Student;

class MathStudent extends Student {
    private String sID;

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    @Override
    public String getRank() {
        return gpa >= 5 ? "Passed" : "Failed";
    }
}
